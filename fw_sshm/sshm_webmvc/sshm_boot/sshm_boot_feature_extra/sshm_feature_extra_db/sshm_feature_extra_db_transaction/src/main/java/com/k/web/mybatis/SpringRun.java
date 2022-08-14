package com.k.web.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = {"com.k.web.mybatis.mybatis.mapper", "classpath:mapper/*.xml"})
public class SpringRun {

    public static void main(String[] args) {
        SpringApplication.run(SpringRun.class, args);
    }
}
