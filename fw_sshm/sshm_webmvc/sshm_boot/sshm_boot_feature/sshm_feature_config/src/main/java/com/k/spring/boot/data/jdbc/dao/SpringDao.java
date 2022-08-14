package com.k.spring.boot.data.jdbc.dao;

import org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.InfrastructureAdvisorAutoProxyCreator;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.transaction.annotation.SpringTransactionAnnotationParser;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see SpringTransactionAnnotationParser
 * @see InfrastructureAdvisorAutoProxyCreator
 * @see AbstractAutoProxyCreator#postProcessBeforeInstantiation(java.lang.Class, java.lang.String)
 * @see AbstractAutoProxyCreator#postProcessAfterInitialization(java.lang.Object, java.lang.String)
 */
public interface SpringDao {

    @Transactional
    @Caching
    @Cacheable
    void insert();
}
