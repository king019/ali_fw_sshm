package com.k.spring.boot.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringControl {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
