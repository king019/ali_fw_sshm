package com.k.spring;

import com.k.spring.boot.config.MyEnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MyEnableAutoConfiguration
public class ControlTest {
    public static void main(final String[] args) {
        SpringApplication.run(ControlTest.class, args);
    }
}
