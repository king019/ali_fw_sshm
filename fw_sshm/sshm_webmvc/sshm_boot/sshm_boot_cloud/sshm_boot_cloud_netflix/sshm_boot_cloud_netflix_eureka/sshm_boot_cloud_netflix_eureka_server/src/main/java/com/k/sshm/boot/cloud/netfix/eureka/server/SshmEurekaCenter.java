package com.k.sshm.boot.cloud.netfix.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SshmEurekaCenter {

    public static void main(String[] args) {
        SpringApplication.run(SshmEurekaCenter.class, args);
    }
}
