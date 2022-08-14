package com.k.sshm.boot.cloud.alibaba.sentinel.control;

import com.k.sshm.boot.cloud.alibaba.sentinel.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloControl {
    @Autowired
    private HelloService helloService;

    @GetMapping("/index")
    @ResponseBody
    private String index() {
        helloService.index();
        return "{}";
    }
}
