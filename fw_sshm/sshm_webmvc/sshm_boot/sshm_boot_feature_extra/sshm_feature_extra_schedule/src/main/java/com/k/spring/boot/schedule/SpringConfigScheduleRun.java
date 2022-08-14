package com.k.spring.boot.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringConfigScheduleRun {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigScheduleRun.class, args);
    }
}
