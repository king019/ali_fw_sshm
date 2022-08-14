package com.k.spring;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ConfigConsts apollo配置
 */
@SpringBootApplication
@EnableApolloConfig
public class SpringApolloRun {

    public static void main(String[] args) {
        SpringApplication.run(SpringApolloRun.class, args);
    }
}
