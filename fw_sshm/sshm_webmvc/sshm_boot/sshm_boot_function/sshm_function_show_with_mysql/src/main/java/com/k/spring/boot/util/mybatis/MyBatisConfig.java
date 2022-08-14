package com.k.spring.boot.util.mybatis;

import lombok.Data;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@MapperScan("com.k.spring.boot.mybatis.dao")
public class MyBatisConfig {
    @Bean
    public DataSource createDataSource(JdbcConfig jdbcConfig) throws SQLException {
        DataSource dataSource = DataSourceBuilder.create(Thread.currentThread().getContextClassLoader())
                .driverClassName(jdbcConfig.getDriver())
                .url(jdbcConfig.getUrl())
                .username(jdbcConfig.getUsername())
                .password(jdbcConfig.getPassword()).build();
        return dataSource;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        ClassPathResource resource = new ClassPathResource("mapper/springMVC-mapper.xml");
        bean.setConfigLocation(resource);
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Data
    @Component
    @ConfigurationProperties(prefix = "mybatis")
    static class JdbcConfig {
        /**
         * 数据库用户名
         */
        private String username;
        /**
         * 驱动名称
         */
        private String driver;
        /**
         * 数据库连接url
         */
        private String url;
        /**
         * 数据库密码
         */
        private String password;
    }
}
