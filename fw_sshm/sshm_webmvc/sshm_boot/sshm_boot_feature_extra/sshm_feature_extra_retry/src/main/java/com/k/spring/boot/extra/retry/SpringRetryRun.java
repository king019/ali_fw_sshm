package com.k.spring.boot.extra.retry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class SpringRetryRun {
    public static void main(String[] args) {
        SpringApplication.run(SpringRetryRun.class, args);
    }
}
