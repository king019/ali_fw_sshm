package com.k.mq.rockmq.producer;

import com.google.common.collect.Lists;
import com.k.mq.rockmq.util.prop.RockmqProps;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
@Slf4j
public class SyncProducer {
    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("please_rename_unique_group_name");
        producer.setNamesrvAddr(RockmqProps.nameServers);
        //producer.setRetryTimesWhenSendFailed();
        producer.start();
        for (int i = 0; i < 100000; i++) {
            log.info("index:{}",i);
            Message msg1 = new Message("TopicTest", "tag1", "key1", ("Hello1" + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
            Message msg2 = new Message("TopicTest", "tag2", "key2", ("Hello2" + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
            producer.send(msg1);
            producer.send(Lists.newArrayList(msg1, msg2));
            SendResult sendResult = producer.send(msg1);
            producer.send(msg1, new SendCallback() {
                @Override
                public void onSuccess(SendResult sendResult) {
log.info("sendResult:{}",sendResult);
                }

                @Override
                public void onException(Throwable e) {
                    log.info("onException",e);
                }
            });
            log.info("{}", sendResult);
        }
        //Shut down once the producer instance is not longer in use.
        producer.shutdown();
    }
}