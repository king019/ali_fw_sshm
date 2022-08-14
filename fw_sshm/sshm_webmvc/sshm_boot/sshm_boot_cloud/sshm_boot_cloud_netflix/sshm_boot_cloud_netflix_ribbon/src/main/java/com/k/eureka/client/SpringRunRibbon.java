package com.k.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringRunRibbon {

    public static void main(final String[] args) {
        SpringApplication.run(SpringRunRibbon.class, args);
    }
}
