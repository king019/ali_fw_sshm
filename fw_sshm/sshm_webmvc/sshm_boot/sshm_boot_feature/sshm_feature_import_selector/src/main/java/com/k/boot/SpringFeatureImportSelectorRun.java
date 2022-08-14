package com.k.boot;

import com.k.boot.selector.EnableSpringStudy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@EnableSpringStudy(first = "v1")
@SpringBootApplication
public class SpringFeatureImportSelectorRun {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringFeatureImportSelectorRun.class, args);
    }
}
