package com.k.sshm.boot.cloud.alibaba.sentinel.control;

import com.k.sshm.boot.cloud.alibaba.sentinel.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class HelloControl {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/index")
    @ResponseBody
    private String index() {
         helloService.index();
        return "{}";
    }
}
