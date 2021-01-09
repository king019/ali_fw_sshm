package com.k.mq.rockmq.producer;

import com.k.mq.rockmq.listener.TransactionCheckListenerImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.TransactionListener;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.common.message.Message;

@Slf4j
public class TransactionProducer {
    public static void main(String[] args) throws MQClientException, InterruptedException {
        TransactionListener transactionCheckListener = new TransactionCheckListenerImpl();
        TransactionMQProducer producer = new TransactionMQProducer("please_rename_unique_group_name");
        // 事务回查最小并发数
        producer.setCheckThreadPoolMinSize(2);
        // 事务回查最大并发数
        producer.setCheckThreadPoolMaxSize(2);
        // 队列数
        producer.setCheckRequestHoldMax(2000);
        producer.setTransactionListener(transactionCheckListener);
        producer.setNamesrvAddr("rkns1:9876");
        producer.start();
        String[] tags = new String[]{"TagA", "TagB", "TagC", "TagD", "TagE"};
        for (int i = 0; i < 100000; i++) {
            try {
                Message msg = new Message("TopicTest", tags[i % tags.length], "KEY" + i, ("Hello RocketMQ " + i).getBytes());
                SendResult sendResult = producer.sendMessageInTransaction(msg, transactionCheckListener);
                log.info("", sendResult);
                Thread.sleep(10);
            } catch (MQClientException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 100000; i++) {
            Thread.sleep(1000);
        }
        producer.shutdown();
    }
}