package com.k.sshm.boot.cloud.alibaba.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SshmCloudNacosConfig {
    public static void main(String[] args) {
        SpringApplication.run(SshmCloudNacosConfig.class, args);
    }
}
