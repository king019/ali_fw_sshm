package com.k.spring.springcloud.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class SpringRunSleuthZipkin {
    public static void main(String[] args) {
        SpringApplication.run(SpringRunSleuthZipkin.class, args);
    }
}
