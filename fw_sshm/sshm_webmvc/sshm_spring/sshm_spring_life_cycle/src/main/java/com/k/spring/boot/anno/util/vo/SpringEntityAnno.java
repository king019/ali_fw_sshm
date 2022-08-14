package com.k.spring.boot.anno.util.vo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Slf4j
public class SpringEntityAnno implements InitializingBean {
    private String className = SpringEntityAnno.class.getName();

    @PostConstruct
    private void init() {
        log.info(className.concat("@PostConstruct"));
    }

    @PreDestroy
    private void destroy() {
        log.info(className.concat("@PreDestroy"));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info(className.concat("@afterPropertiesSet"));
    }
}
