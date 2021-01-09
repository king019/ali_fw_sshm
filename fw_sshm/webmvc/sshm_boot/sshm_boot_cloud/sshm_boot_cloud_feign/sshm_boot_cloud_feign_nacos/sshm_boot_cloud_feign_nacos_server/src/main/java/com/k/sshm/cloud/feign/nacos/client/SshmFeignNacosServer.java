package com.k.sshm.cloud.feign.nacos.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SshmFeignNacosServer {

    public static void main(String[] args) {
        SpringApplication.run(SshmFeignNacosServer.class, args);
    }

}