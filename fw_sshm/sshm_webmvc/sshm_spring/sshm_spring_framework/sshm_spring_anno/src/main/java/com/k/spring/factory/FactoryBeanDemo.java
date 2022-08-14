package com.k.spring.factory;

import com.k.spring.vo.BeanVO;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("factoryBeanDemo")
public class FactoryBeanDemo implements FactoryBean<BeanVO> {
    @Override
    public BeanVO getObject() throws Exception {
        return new BeanVO();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
