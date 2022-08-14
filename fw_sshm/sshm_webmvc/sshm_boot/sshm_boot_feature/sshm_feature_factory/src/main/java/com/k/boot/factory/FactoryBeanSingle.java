package com.k.boot.factory;

import com.k.boot.model.ModelSingle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FactoryBeanSingle implements FactoryBean<ModelSingle>, InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        log.error("destroy");
    }

    @Override
    public ModelSingle getObject() throws Exception {
        log.error("getObject");
        return new ModelSingle();
    }

    @Override
    public Class<?> getObjectType() {
        return ModelSingle.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.error("afterPropertiesSet");
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
