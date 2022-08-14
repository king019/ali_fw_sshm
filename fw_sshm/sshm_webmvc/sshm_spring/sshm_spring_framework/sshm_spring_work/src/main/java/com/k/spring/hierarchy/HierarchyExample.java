package com.k.spring.hierarchy;

import com.k.spring.hierarchy.example.base.factory.AdapterFactoryBase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
@Slf4j
public class HierarchyExample {
    @Resource(name = "adapterFactoryBaseOne")
    private AdapterFactoryBase factory;

    @PostConstruct
    private void first() {
        log.info("first");
    }

    @PreDestroy
    private void last() {
        log.info("last");
    }

    public AdapterFactoryBase getFactory() {
        return factory;
    }

    public void setFactory(AdapterFactoryBase factory) {
        this.factory = factory;
    }
}
