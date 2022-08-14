package com.k.spring.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SshmFeignServer {

    public static void main(String[] args) {
        SpringApplication.run(SshmFeignServer.class, args);
    }

}