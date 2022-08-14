package com.k.spring.mq.rabbitmq.util.listen;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.SendTo;

public class RBListener {
    @RabbitListener(queues = {""})
    @SendTo()
    public void po() {
    }
}
