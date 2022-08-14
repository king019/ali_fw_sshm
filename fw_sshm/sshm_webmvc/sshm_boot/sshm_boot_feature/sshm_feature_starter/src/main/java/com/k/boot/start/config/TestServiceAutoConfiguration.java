package com.k.boot.start.config;

import com.k.boot.start.property.TestProperties;
import com.k.boot.start.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TestProperties.class)
@ConditionalOnClass(TestService.class)
@ConditionalOnProperty(prefix = "test", value = "enabled", matchIfMissing = true)
public class TestServiceAutoConfiguration {
    @Autowired
    TestProperties testProperties;

    @Bean
    @ConditionalOnMissingBean(TestService.class)
    public TestService testService() {
        TestService testService = new TestService();
        testService.setMsg(testProperties.getMsg());
        return testService;
    }
}