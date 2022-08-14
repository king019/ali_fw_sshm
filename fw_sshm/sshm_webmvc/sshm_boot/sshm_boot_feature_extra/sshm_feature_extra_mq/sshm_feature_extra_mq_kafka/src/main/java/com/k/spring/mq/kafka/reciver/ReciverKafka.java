package com.k.spring.mq.kafka.reciver;

import com.k.spring.mq.kafka.model.JsonObject;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class ReciverKafka {
    int index = 0;

    @SneakyThrows
    @KafkaListener(id = "listenAuto", topics = "topic", containerGroup = "g1", concurrency = "2", containerFactory = "ListenerAuto")
    public void listenAuto(ConsumerRecord<String, JsonObject> record) {
        log.info(record.toString());
        if (Objects.nonNull(record)) {
            log.info("listenAuto index:{}", index++);
            //throw new Exception();
        }
    }

    @SneakyThrows
    //@KafkaListener(id = "listenAck", topics = "topic", containerGroup = "g1", concurrency = "2", containerFactory = "ListenerAck")
    public void listenAck(ConsumerRecord<String, JsonObject> record, Acknowledgment ack) {
        log.info(record.toString());
        if (Objects.nonNull(record)) {
            log.info("listenAck index:{}", index++);
            throw new Exception();
        }
        ack.acknowledge();
    }

    @SneakyThrows
    //@KafkaListener(id = "listenAck", topics = "topic", containerGroup = "g1", concurrency = "2", containerFactory = "ListenerAck")
    public void listenAckList(List<ConsumerRecord<?, ?>> records, Acknowledgment ack) {
        for (ConsumerRecord<?, ?> record : records) {
            log.info(record.toString());
            if (Objects.nonNull(record)) {
                throw new Exception();
            }
        }
        ack.acknowledge();
    }

//    public void test() {
//        final KafkaConsumer<String, String> consumer = new KafkaConsumer<>(KafkaConfig.queryConsumerConfig());
//        consumer.subscribe(Lists.newArrayList("topic", "test"));
//        Map<String, List<PartitionInfo>> map = consumer.listTopics();
//        final ConsumerRecords<String, String> records = consumer.poll(Duration.ofSeconds(5));
//        for (final ConsumerRecord<String, String> record : records) {
//            Map<TopicPartition, OffsetAndMetadata> offsets = Maps.newHashMap();
//            TopicPartition topicPartition = new TopicPartition(record.topic(), record.partition());
//            OffsetAndMetadata offsetAndMetadata = new OffsetAndMetadata(record.offset());
//            offsets.put(topicPartition, offsetAndMetadata);
//            consumer.commitSync(offsets);
//            consumer.commitAsync();
//            log.info("offset = {}, key = {}, value = {}", record.offset(), record.key(), record.value());
//        }
//        consumer.close();
//    }
}
