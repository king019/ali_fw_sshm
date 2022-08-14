package com.k.spring.boot.data.jdbc.inf;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.k.spring.boot.mybatis.dao")
public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        ClassPathResource resource = new ClassPathResource("mapper/springMVC-mapper.xml");
        bean.setConfigLocation(resource);
        bean.setDataSource(dataSource);
        return bean;
    }
}
