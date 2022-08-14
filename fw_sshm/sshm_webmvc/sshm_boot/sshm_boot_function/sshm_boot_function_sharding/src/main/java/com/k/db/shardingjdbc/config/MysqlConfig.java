package com.k.db.shardingjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MysqlConfig {
    @ConfigurationProperties(prefix = "mybatis.ds0")
    @Bean(destroyMethod = "close", initMethod = "init")
    public DruidDataSource mysqlDs0() {
        return new DruidDataSource();
    }

    @ConfigurationProperties(prefix = "mybatis.ds1")
    @Bean(destroyMethod = "close", initMethod = "init")
    public DruidDataSource mysqlDs1() {
        return new DruidDataSource();
    }
}
