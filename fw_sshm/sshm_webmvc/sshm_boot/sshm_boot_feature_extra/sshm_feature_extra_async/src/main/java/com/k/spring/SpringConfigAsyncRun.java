package com.k.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringConfigAsyncRun {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigAsyncRun.class, args);
    }
}
