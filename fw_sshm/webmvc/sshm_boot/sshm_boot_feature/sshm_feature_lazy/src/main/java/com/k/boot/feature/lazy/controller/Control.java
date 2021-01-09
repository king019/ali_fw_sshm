package com.k.boot.feature.lazy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class Control {
    public Control() {
        log.info("ControlLazy");
    }

    @GetMapping(value = "/index")
    public Map<String, String> index() {
        return Map.of("now", String.valueOf(System.currentTimeMillis()));
    }

}
