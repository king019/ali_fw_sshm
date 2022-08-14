package com.k.spring.boot;

import com.k.spring.boot.util.BootProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"com.k.spring.boot"})
@EnableConfigurationProperties({BootProperty.class})
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableAsync(proxyTargetClass = true)
//@EnableSwagger2
public class FunctionShow {

    public static void main(String[] args) {
        SpringApplication.run(FunctionShow.class, args);
    }
}
