package com.k.sshm.boot.cloud.alibaba.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SshmCloudNacosConsumer {

    public static void main(String[] args) {
        SpringApplication.run(SshmCloudNacosConsumer.class, args);
    }
}
