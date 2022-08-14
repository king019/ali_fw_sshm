package com.k.sshm.boot.cloud.dubbo.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexAnnoGroupController {

    @GetMapping("/index")
    public String index(String name) {
        return name;
    }
}
