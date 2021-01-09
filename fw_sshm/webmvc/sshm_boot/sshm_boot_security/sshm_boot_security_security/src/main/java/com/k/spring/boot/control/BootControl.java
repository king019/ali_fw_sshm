package com.k.spring.boot.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class BootControl {

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        return "ok";
    }
}
