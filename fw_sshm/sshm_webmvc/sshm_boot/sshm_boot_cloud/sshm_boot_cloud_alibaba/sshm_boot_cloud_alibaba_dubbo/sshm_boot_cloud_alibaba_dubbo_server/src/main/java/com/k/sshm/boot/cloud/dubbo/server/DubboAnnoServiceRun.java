package com.k.sshm.boot.cloud.dubbo.server;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDubbo(scanBasePackages = "com.k.dubbo.service.impl")
@EnableDubbo
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DubboAnnoServiceRun {
    public static void main(String[] args) {
        //System.setProperty(AppNameUtil.APP_NAME,"provider.dubbo");
        SpringApplication.run(DubboAnnoServiceRun.class, args);
    }
}
