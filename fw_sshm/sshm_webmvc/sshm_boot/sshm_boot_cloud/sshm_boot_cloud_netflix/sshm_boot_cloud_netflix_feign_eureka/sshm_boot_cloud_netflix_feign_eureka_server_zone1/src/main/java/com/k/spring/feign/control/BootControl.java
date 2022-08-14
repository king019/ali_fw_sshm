package com.k.spring.feign.control;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BootControl {

    @GetMapping(value = "/index")
    public String index() {
        log.info("BootControl index");
        throw new RuntimeException("");
    }
}
