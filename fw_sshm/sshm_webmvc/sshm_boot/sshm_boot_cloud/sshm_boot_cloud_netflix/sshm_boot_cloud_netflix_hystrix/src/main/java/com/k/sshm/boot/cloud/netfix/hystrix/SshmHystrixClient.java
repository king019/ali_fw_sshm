package com.k.sshm.boot.cloud.netfix.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableCircuitBreaker

public class SshmHystrixClient {

    public static void main(String[] args) {
        SpringApplication.run(SshmHystrixClient.class, args);
    }
}
