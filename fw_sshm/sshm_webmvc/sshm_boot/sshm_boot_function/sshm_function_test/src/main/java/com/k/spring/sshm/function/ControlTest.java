package com.k.spring.sshm.function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ControlTest {
    public static void main(String[] args)  {
        SpringApplication.run(ControlTest.class, args);
    }
}
