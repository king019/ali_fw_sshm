package com.k.boot.processor;

import com.k.boot.service.ServiceSingleInface;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Service
public class InstantiationAwareBeanPostProcessorSingleImpl implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (ServiceSingleInface.class.isAssignableFrom(bean.getClass())) {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            Object instance = Proxy.newProxyInstance(classLoader, new Class[]{ServiceSingleInface.class},
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            return method.invoke(bean, args);
                        }
                    });
            return instance;
        } else {
            return bean;
        }
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (ServiceSingleInface.class.isAssignableFrom(bean.getClass())) {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            Object instance = Proxy.newProxyInstance(classLoader, new Class[]{ServiceSingleInface.class},
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            return method.invoke(bean, args);
                        }
                    });
            return instance;
        } else {
            return bean;
        }
    }
}
