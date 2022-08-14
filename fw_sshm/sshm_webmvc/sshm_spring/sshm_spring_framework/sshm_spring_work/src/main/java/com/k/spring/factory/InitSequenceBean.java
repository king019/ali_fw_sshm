package com.k.spring.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

@Slf4j
public class InitSequenceBean implements InitializingBean {
    public InitSequenceBean() {
        log.info("InitSequenceBean: constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log.info("InitSequenceBean: postConstruct");
    }

    public void initMethod() {
        log.info("InitSequenceBean: init-method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("InitSequenceBean: afterPropertiesSet");
    }
}