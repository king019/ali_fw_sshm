package com.k.spring.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@SpringBootApplication(scanBasePackages = {"com.k.spring"})
@EnableScheduling
public class ControlTest {
  public static void main(String[] args) throws Exception {
    SpringApplication.run(ControlTest.class, args);
  }
}
