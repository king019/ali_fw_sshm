package com.k.spring.boot.util.config.yaml;

import com.k.spring.boot.util.config.yaml.vo.ConfigVO;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * Created by k on 17-7-13.
 */
@Component
@ConfigurationProperties(prefix = "cfgvo")
public class MyV1Config {
    @Bean
    public ConfigVO servers() {
        final ConfigVO cfgvo1 = new ConfigVO();
        return cfgvo1;
    }

    @Bean
    public ConfigVO servers1(final ConfigVO cfg) {
        final ConfigVO cfgvo = cfg;
        return cfgvo;
    }
}
