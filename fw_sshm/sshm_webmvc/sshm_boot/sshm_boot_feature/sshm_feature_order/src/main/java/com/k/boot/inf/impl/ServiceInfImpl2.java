package com.k.boot.inf.impl;

import com.k.boot.inf.ServiceInf;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Order(2)
@Slf4j
public class ServiceInfImpl2 implements ServiceInf {
    @PostConstruct
    public void init() {
        log.info("ServiceInfImpl2");
    }
}
