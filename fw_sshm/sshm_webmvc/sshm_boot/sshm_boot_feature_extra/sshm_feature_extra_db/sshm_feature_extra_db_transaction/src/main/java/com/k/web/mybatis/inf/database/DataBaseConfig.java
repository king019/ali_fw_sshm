package com.k.web.mybatis.inf.database;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseConfig {
    @Bean
    @ConfigurationProperties(prefix = "dbcp")
    public BasicDataSource basicDataSource() {
        return new BasicDataSource();
    }
}
