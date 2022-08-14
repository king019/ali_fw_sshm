package com.k.spring.mq.rabbitmq.send;

import com.k.spring.mq.rabbitmq.util.ObjectAndByte;
import com.k.spring.mq.rabbitmq.vo.Foo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.core.MessagePropertiesBuilder;
import org.springframework.amqp.rabbit.connection.SimpleRoutingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

@Slf4j
public class Sender   {

    @Resource
    ApplicationContext applicationContext;
    @Resource
    RabbitTemplate rabbitTemplate;
    @Resource
    SimpleRoutingConnectionFactory simpleRoutingConnectionFactory;

    @Test
    @Ignore
    public void test() {
        Foo foo = new Foo();
        {
            {
                Message message = MessageBuilder.withBody("foo".getBytes()).setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId("123").setHeader("bar", "baz").build();
            }
            {
                MessageProperties props = MessagePropertiesBuilder.newInstance().setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId("123").setHeader("bar", "baz").build();
            }
            {
                // Message message = MessageBuilder.withBody("foo".getBytes()).andProperties(props).build();
            }
        }
        MessageProperties messageProperties = new MessageProperties();
        Message message = new Message(ObjectAndByte.toByteArray(foo), messageProperties);
        // rabbitTemplate = new RabbitTemplate(simpleRoutingConnectionFactory.getTargetConnectionFactory(DbDef.DF1.getDbName()));
        rabbitTemplate.send(message);
        Object obj = applicationContext.getBean("connectionFactory");
        Object obj1 = applicationContext.getBean("amqpTemplate");
        log.info("{}", applicationContext);
    }
}
