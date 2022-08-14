package com.k.spring.mq.rabbitmq.reciver;

import org.springframework.amqp.core.ReceiveAndReplyCallback;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

public class Reciver  {
    @Resource
    ApplicationContext applicationContext;
    @Resource
    RabbitTemplate rabbitTemplate;

    public void test() {
        rabbitTemplate.receiveAndReply(new ReceiveAndReplyCallback<String, Integer>() {
            @Override
            public Integer handle(String payload) {
                return null;
            }
        });
    }
}
