package com.k.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SshmFeatureOrderRun {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SshmFeatureOrderRun.class, args);
    }
}
