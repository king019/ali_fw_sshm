package com.k.spring.sshm.boot.security.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class BootControl {

    @GetMapping("/index")
    public String index(HttpServletRequest request) {
        return "ok";
    }
}
