package com.k.spring.aop.point.service.impl;

import com.k.spring.aop.point.service.SpringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service("service2")
public class SpringService2Impl implements SpringService {
    @Resource(name = "service1")
    private SpringService springService;

    @Override
    public void service() {
        log.info("service");
    }
}
