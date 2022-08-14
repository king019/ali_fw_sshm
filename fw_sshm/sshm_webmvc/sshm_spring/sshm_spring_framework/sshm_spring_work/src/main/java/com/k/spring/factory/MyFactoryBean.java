package com.k.spring.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class MyFactoryBean implements FactoryBean<String> {
    @Override
    public String getObject() throws Exception {
        return UUID.randomUUID().toString();
    }

    @Override
    public Class<String> getObjectType() {
        return String.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
