package com.k.boot.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

@Slf4j
@Service("beanPostProcessorImpl")
public class BeanPostProcessorImpl implements SmartInstantiationAwareBeanPostProcessor, MergedBeanDefinitionPostProcessor {
    @Value("张三")
    private String name;
    private String name1;
    @Autowired
    private BeanFactoryPostProcessorImpl beanFactoryPostProcessor;

    @PostConstruct
    public void init() {
        log.info("init");
    }

    @PreDestroy
    public void destry() {
        log.info("destry");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("BeanPostProcessor.postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        log.info("BeanPostProcessor.postProcessAfterInitialization");
        return bean;
    }

    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        log.info("MergedBeanDefinitionPostProcessor.postProcessMergedBeanDefinition");
    }

    @Override
    public void resetBeanDefinition(String beanName) {
        log.info("MergedBeanDefinitionPostProcessor.resetBeanDefinition");
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        log.info("InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        log.info("InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation");
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        log.info("InstantiationAwareBeanPostProcessor.postProcessProperties");
        return pvs;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        log.info("InstantiationAwareBeanPostProcessor.postProcessPropertyValues");
        return pvs;
    }

    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        log.info("SmartInstantiationAwareBeanPostProcessor.predictBeanType");
        return null;
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        log.info("SmartInstantiationAwareBeanPostProcessor.determineCandidateConstructors");
        return null;
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        log.info("SmartInstantiationAwareBeanPostProcessor.getEarlyBeanReference");
        return null;
    }
}
