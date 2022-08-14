package com.k.spring.boot.util.vo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VOConfig {
    @Bean
    public VO1 v1Bean() {
        VO1 vo1 = new VO1();
        vo1.setId("id1bean");
        return vo1;
    }
}
