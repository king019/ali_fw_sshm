package com.k.spring.mq.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringMqKafkaRun {
    public static void main(String[] args) {
        SpringApplication.run(SpringMqKafkaRun.class, args);
    }
}
