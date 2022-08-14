package com.k.sshm.cloud.feign.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//@EnableDiscoveryClient
public class SshmFeignClient {

    public static void main(String[] args) {
        SpringApplication.run(SshmFeignClient.class, args);
    }

}