package com.k.spring.mq.rabbitmq.util.listen;

import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Slf4j
public class Listen1 {
    @RabbitListener(queues = {"myQueue"})
    @Transactional()
    public void lsten(Channel channel, Message message, long deliveryTag, boolean multiple) {
        message.getMessageProperties().getReceivedRoutingKey();
        // channel.basicAck(deliveryTag, multiple);
        log.info("", message);
    }
}
