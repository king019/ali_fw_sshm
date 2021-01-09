package com.k.sshm.cloud.feign.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class SshmFeignNacosClient {

    public static void main(String[] args) {
        SpringApplication.run(SshmFeignNacosClient.class, args);
    }

}