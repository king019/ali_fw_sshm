package com.k.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;

@SpringBootApplication(exclude = {MongoDataAutoConfiguration.class})
public class SpringMongoRun {
    public static void main(String[] args) {
        SpringApplication.run(SpringMongoRun.class, args);
    }
}
