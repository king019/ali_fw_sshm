package com.k.spring.boot;

import com.k.spring.boot.control.BootControl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.k.spring.boot.mybatis.dao")
@SpringBootApplication
public class ControlWithMysqlRuner {
    public static void main(String[] args) {
        SpringApplication.run(BootControl.class, args);
    }
}
