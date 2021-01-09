package com.k.spring;

import com.k.spring.boot.util.BootProperty;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = {"com.k.spring.boot"})
@EnableConfigurationProperties({BootProperty.class})
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableAsync(proxyTargetClass = true)
@EnableSwagger2Doc
public class FunctionShow {

  public static void main(String[] args)  {
    SpringApplication.run(FunctionShow.class, args);
  }
}
