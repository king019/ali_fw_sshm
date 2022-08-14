package com.k.atomikos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class DataSourceConfig {

    @Autowired
    private Environment env;

    @Bean(name = "primaryDS")
    @Primary
    public DataSource primaryDataSource() {
        DataBaseConfig config = primaryConfig();
        AtomikosDataSourceBean ds = new AtomikosDataSourceBean();
        ds.setXaDataSourceClassName("com.alibaba.druid.pool.xa.DruidXADataSource");
        ds.setUniqueResourceName("primaryRN");
        ds.setPoolSize(5);
        ds.setXaProperties(build(config));
        return ds;
    }

    @Bean(name = "secondaryDS")
    public DataSource dataSource() {
        DataBaseConfig config = secondaryConfig();
        AtomikosDataSourceBean ds = new AtomikosDataSourceBean();
        ds.setXaDataSourceClassName("com.alibaba.druid.pool.xa.DruidXADataSource");
        ds.setUniqueResourceName("secondaryRN");
        ds.setPoolSize(5);
        ds.setXaProperties(build(config));
        return ds;
    }

    private Properties build(DataBaseConfig config) {
        Properties prop = new Properties();
        prop.put("url", config.getUrl());
        prop.put("username", config.getUsername());
        prop.put("password", config.getPassword());
        prop.put("driverClassName", config.getDriverClassName());
        return prop;
    }

    @Bean
    @ConfigurationProperties(prefix = "database.primary.datasource")
    public DataBaseConfig primaryConfig() {
        return new DataBaseConfig();
    }

    @Bean
    @ConfigurationProperties(prefix = "database.secondary.datasource")
    public DataBaseConfig secondaryConfig() {
        return new DataBaseConfig();
    }
}