package com.k.spring.actuator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class SpringBootRun {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootRun.class, args);
        log.error("*****************************************************************");
    }
}
