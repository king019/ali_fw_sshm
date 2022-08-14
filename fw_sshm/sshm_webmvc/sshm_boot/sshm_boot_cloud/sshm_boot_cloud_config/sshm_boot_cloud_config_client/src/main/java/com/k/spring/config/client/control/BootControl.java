package com.k.spring.config.client.control;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BootControl {
    @Value("${demo.title}")
    public String show;

    @GetMapping(value = "/index")
    public String index() {
        log.info("BootControl index");
        return show;
    }
}
