package com.k.atomikos.config;

import lombok.Data;

@Data
public class DataBaseConfig {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
