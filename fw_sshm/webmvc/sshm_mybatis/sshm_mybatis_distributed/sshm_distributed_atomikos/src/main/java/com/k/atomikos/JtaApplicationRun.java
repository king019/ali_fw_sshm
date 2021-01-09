package com.k.atomikos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TransactionStateHandler  分布式事务执行
 */
@SpringBootApplication
public class JtaApplicationRun {

    public static void main(String[] args) {
        SpringApplication.run(JtaApplicationRun.class, args);
    }
}
