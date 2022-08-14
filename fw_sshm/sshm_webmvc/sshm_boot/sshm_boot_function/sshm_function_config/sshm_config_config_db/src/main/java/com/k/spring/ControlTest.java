package com.k.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement(mode = AdviceMode.PROXY)
public class ControlTest {
    public static void main(final String[] args) throws Exception {
        SpringApplication.run(ControlTest.class, args);
    }
}
