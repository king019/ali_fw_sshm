package com.k.spring.boot.inf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;

//import org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader;

//import org.springframework.context.annotation.ConfigurationClass;

/**
 * @see ConfigurationClassPostProcessor#postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory) 扫描Configuration注解和处理
 * @see //org.springframework.context.annotation.ConfigurationClassParser#retrieveBeanMethodMetadata
 * @see //ConfigurationClassParser#doProcessConfigurationClass(org.springframework.context.annotation.ConfigurationClass, org.springframework.context.annotation.ConfigurationClassParser.SourceClass) 将config中的bean主机加载下
 * @see //ConfigurationClass#addBeanMethod(org.springframework.context.annotation.BeanMethod) 添加beanMethod方法
 * @see //ConfigurationClassBeanDefinitionReader#loadBeanDefinitionsForBeanMethod(org.springframework.context.annotation.BeanMethod) 添加bean注解到beanFactory中
 * @see //org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#instantiateUsingFactoryMethod 创建bean注解到对象
 * @see //org.springframework.context.annotation.ConfigurationClassEnhancer.BeanMethodInterceptor#intercept 真正创建bean方法
 */
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
