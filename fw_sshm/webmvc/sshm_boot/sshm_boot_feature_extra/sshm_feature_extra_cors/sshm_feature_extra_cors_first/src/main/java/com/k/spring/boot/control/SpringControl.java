package com.k.spring.boot.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringControl {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
