package com.k.spring.boot.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "spring.datasource")
public class BootProperty {
    private String url;
    private String username;
    private String password;
    private String driver;
}
