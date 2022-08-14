package com.k.sshm.boot.dubbo.client;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ImportResource("spring-anno.xml")
@EnableDubbo
//@EnableDiscoveryClient
@SpringBootApplication
public class DubboAnnoApiRun {
    public static void main(String[] args) {
//        System.setProperty(AppNameUtil.APP_NAME,"consumer.dubbo");
        SpringApplication.run(DubboAnnoApiRun.class, args);
    }
}
