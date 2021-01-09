package com.k.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class FunctionShow {

  public static void main(String[] args)  {
    SpringApplication.run(FunctionShow.class, args);
  }
}
