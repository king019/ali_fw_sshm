package com.k.spring.controller;

import com.k.spring.service.SpringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Controller
public class Springcontroller {
    @Resource
    private List<SpringService> services;

    @PostConstruct
    public void init() {
        log.info("{}", services);
    }
}
