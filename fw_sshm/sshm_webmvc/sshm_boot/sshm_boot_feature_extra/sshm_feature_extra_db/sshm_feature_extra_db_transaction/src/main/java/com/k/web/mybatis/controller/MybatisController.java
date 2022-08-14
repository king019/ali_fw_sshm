package com.k.web.mybatis.controller;

import com.k.web.mybatis.service.MybatisTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MybatisController {
    @Autowired
    private MybatisTestService mybatisTestService;

    @GetMapping("/select")
    public String select() throws Exception {
        log.info("select");
        return mybatisTestService.select().toString();
    }
}
