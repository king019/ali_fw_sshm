package com.k.mq.rockmq.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @Autowired
    private DefaultMQProducer producer;

//  @Autowired
//  private TransactionMQProducer producer;


    @GetMapping("/index")
    public void test(String info) throws Exception {
        Message message = new Message("TopicTest", "Tag1", "12345", "rocketmq测试成功".getBytes());
        // 这里用到了这个mq的异步处理，类似ajax，可以得到发送到mq的情况，并做相应的处理
        //不过要注意的是这个是异步的
        producer.send(message);
//        producer.send(message, new SendCallback() {
//            @Override
//            public void onSuccess(SendResult sendResult) {
//                log.info("传输成功");
//                log.info( "{}",sendResult);
//            }
//            @Override
//            public void onException(Throwable e) {
//                log.error("传输失败", e);
//            }
//        });
    }
}