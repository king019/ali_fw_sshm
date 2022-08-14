package com.k.boot.factory;

import com.k.boot.model.ModelProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class FactoryBeanProperty implements FactoryBean<ModelProperty>, InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        log.error("destroy");
    }

    @PostConstruct
    public void init() throws Exception {
        log.error("init");
    }

    @Override
    public ModelProperty getObject() throws Exception {
        log.error("getObject");
        return new ModelProperty();
    }

    @Override
    public Class<?> getObjectType() {
        return ModelProperty.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.error("afterPropertiesSet");
    }

    @Override
    public boolean isSingleton() {
        log.error("isSingleton");
        return false;
    }
}
