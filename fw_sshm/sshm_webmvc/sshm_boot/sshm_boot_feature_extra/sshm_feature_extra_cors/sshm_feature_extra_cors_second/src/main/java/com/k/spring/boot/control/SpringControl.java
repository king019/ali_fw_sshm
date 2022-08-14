package com.k.spring.boot.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringControl {

    @GetMapping("/index")
    @ResponseBody
    public String index(String key) {
        return "{}";
    }
}
