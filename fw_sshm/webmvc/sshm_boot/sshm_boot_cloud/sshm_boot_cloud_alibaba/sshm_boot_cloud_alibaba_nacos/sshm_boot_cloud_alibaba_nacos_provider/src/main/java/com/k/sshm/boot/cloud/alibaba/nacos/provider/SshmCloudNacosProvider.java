package com.k.sshm.boot.cloud.alibaba.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SshmCloudNacosProvider {

    public static void main(String[] args) {
        SpringApplication.run(SshmCloudNacosProvider.class, args);
    }
}
