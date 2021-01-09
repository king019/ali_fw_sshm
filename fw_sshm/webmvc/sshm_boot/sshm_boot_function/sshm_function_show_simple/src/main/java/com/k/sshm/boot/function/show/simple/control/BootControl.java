package com.k.sshm.boot.function.show.simple.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootControl {
    @Value("server.port")
    private String port;
    @Value("${prop.name}")
    private String propName;
//    @GetMapping("/index")
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        throw new RuntimeException();
//        return propName;
    }
}
