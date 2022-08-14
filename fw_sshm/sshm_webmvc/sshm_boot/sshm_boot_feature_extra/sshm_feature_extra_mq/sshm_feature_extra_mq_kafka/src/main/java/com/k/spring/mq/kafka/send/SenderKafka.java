package com.k.spring.mq.kafka.send;

import com.k.spring.mq.kafka.model.JsonObject;
import com.k.spring.mq.kafka.model.UserRecord;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SenderKafka {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send() {
        UserRecord user = new UserRecord();
        user.setFavoriteColor("12");
        user.setFavoriteNumber(1);
        user.setName("22");
        JsonObject obj=new JsonObject();
        obj.setName("name");
        kafkaTemplate.send(new ProducerRecord<>("topic", "key", obj));
    }
}
