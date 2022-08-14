package com.k.spring.boot.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncExecutionInterceptor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncAnnotationAdvisor;
import org.springframework.scheduling.annotation.AsyncAnnotationBeanPostProcessor;
import org.springframework.stereotype.Service;

/**
 * @see AsyncAnnotationBeanPostProcessor
 * @see AsyncExecutionInterceptor
 * @see AsyncAnnotationAdvisor#AsyncAnnotationAdvisor(java.util.function.Supplier, java.util.function.Supplier) async 构建切面
 */
@Service
@Slf4j
public class AsyncService {

    @Async
    public void async() {
    }
}
