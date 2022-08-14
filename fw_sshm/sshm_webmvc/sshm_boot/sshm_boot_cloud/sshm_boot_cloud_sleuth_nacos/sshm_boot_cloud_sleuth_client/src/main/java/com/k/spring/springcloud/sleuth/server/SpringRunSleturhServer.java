package com.k.spring.springcloud.sleuth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringRunSleturhServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringRunSleturhServer.class, args);
    }
}
