package com.k.spring.boot.inf.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory;
import org.springframework.aop.aspectj.annotation.ReflectiveAspectJAdvisorFactory;
import org.springframework.stereotype.Service;

/**
 * @see ReflectiveAspectJAdvisorFactory
 * @see AbstractAspectJAdvisorFactory
 * @see ReflectiveAspectJAdvisorFactory#getAdvice(java.lang.reflect.Method, org.springframework.aop.aspectj.AspectJExpressionPointcut, org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory, int, java.lang.String) 构建切面等信息
 */
@Slf4j
@Service
@Aspect
public class AopInterceptor {

    @Before("execution(* com.k.web.spring.point..*.*(..))")
    public void befer(JoinPoint pjp) {
        pjp.getArgs();
        pjp.getSignature().getName();
        pjp.getTarget();
        pjp.getTarget().getClass().getName();
        log.info("befer1");
    }

    @Before("execution(* com.k.web.spring.point..*.*(..))")
    public void befer() {
        log.info("befer2");
    }

    @After("execution(* com.k.web.spring.point..*.*(..))")
    public void after() {
        log.info("after2");
    }

    @After("execution(* com.k.web.spring.point..*.*(..))")
    public void after(JoinPoint pjp) {
        pjp.getArgs();
        pjp.getSignature().getName();
        pjp.getTarget();
        pjp.getTarget().getClass().getName();
        log.info("after1");
    }

    @Around("execution(* com.k.web.spring.point..*.*(..))")
    public Object around(ProceedingJoinPoint pjp) {
        // 调用目标方法之前执行的动作
        pjp.getArgs();
        pjp.getSignature().getName();
        pjp.getTarget();
        pjp.getTarget().getClass().getName();
        // 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行
        log.info("around befer");
        try {
            return pjp.proceed();
        } catch (Throwable e) {
            log.error("proceed", e);
        } finally {
            log.info("around after");
        }
        return null;
    }
}
