package com.k.spring.boot.inf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JbdcConfig {

    @Bean
    @ConfigurationProperties(prefix = "mybatis")
    public Mybatis mybatisConfig() {
        return new Mybatis();
    }

    @Data
    public final class Mybatis {

        private String url;
        private String userName;
    }
}
