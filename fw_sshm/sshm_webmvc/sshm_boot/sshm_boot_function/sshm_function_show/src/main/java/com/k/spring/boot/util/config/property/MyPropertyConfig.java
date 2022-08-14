package com.k.spring.boot.util.config.property;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by k on 17-7-13.
 */
@Data
@Component
@Slf4j
@PropertySource("classpath:config/boot.properties")
public class MyPropertyConfig {
    @Value("${boot.id}")
    private String bootId;

    @PostConstruct
    private void init() {
        log.info("", bootId);
    }
}
