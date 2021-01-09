package com.k.spring.boot.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Service@Slf4j
public class ServiceServerImpl2 implements ServiceServer2 {
    @Autowired
    private ServiceServer1 serviceServer1;
    @Resource
    private ServiceServer1 serviceServer11;
    @PostConstruct
    private void init() {
        log.info("init");
    }
}
