package com.k.sshm.boot.cloud.netfix.hystrix ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableCircuitBreaker
//@EnableHystrixDashboard
public class SshmHystrixClient {

    public static void main(String[] args) {
        SpringApplication.run(SshmHystrixClient.class, args);
    }
}
