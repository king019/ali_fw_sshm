package com.k.spring.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringFeatureAopRun {

    public static void main(String[] args) {
        SpringApplication.run(SpringFeatureAopRun.class, args);
    }
}
