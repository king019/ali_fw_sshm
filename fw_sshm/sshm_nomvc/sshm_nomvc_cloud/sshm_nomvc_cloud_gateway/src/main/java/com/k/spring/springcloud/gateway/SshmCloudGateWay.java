package com.k.spring.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SshmCloudGateWay {

    public static void main(String[] args) {
        SpringApplication.run(SshmCloudGateWay.class, args);
    }
}
