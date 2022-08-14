package com.k.spring.boot.util.config.yaml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Data
@Component
@ConfigurationProperties("environments")
public class EnvironmentsConfig {
    private String product;
    private Map<String, String> dev = new HashMap<>();
    private Map<String, String> prod = new HashMap<>();
}
