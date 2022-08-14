package com.k.spring.mq.rabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class SpringMqRabbitmqRun {
    public static void main(String[] args) {
        SpringApplication.run(SpringMqRabbitmqRun.class, args);
    }
}
