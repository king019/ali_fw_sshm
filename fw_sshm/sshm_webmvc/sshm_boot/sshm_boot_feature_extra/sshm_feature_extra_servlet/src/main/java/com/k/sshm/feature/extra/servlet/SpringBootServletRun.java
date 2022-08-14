package com.k.sshm.feature.extra.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBootServletRun {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServletRun.class, args);
    }
}
