package com.k.spring.springcloud.sleuth.server.control;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class HelloControl {
    @GetMapping("/index")
    private Map<String, String> index() {
        log.info("index");
        return Maps.newHashMap();
    }
}
