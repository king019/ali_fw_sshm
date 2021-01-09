package com.k.spring.boot.inf;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
public class MyBatisConfig {

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        ClassPathResource resource = new ClassPathResource("config/mapper-config.xml");
        bean.setConfigLocation(resource);
        bean.setDataSource(dataSource);
        return bean.getObject();
    }


    @Primary
    @ConfigurationProperties(prefix = "mybatis")
    @Bean(destroyMethod = "close", initMethod = "init")
    public DruidDataSource writeDataSource() {
        return new DruidDataSource();
    }
}
