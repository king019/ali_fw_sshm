package com.k.spring.sshm.boot.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class SshmSecurityShow {

    public static void main(String[] args) {
        SpringApplication.run(SshmSecurityShow.class, args);
    }
}
