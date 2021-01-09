package com.k.spring.config.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class  CloudCofigClient  {

  public static void main(String[] args) {
    SpringApplication.run(CloudCofigClient.class, args);
  }
}