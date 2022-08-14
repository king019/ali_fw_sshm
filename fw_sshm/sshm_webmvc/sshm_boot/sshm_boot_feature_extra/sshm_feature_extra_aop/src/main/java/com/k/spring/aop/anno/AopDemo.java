package com.k.spring.aop.anno;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class AopDemo {

    @Before("execution(* com.k.spring.point..*.*(..))")
    public void befer(JoinPoint pjp) {
        pjp.getArgs();
        pjp.getSignature().getName();
        pjp.getTarget();
        pjp.getTarget().getClass().getName();
        log.info("befer1");
    }

    @Before("execution(* com.k.spring.point..*.*(..))")
    public void befer() {
        log.info("befer2");
    }

    @After("execution(* com.k.spring.point..*.*(..))")
    public void after() {
        log.info("after2");
    }

    @After("execution(* com.k.spring.point..*.*(..))")
    public void after(JoinPoint pjp) {
        pjp.getArgs();
        pjp.getSignature().getName();
        pjp.getTarget();
        pjp.getTarget().getClass().getName();
        log.info("after1");
    }

    @AfterReturning("execution(* com.k.spring.point..*.*(..))")
    public void afterRet(JoinPoint pjp) {
        pjp.getArgs();
        pjp.getSignature().getName();
        pjp.getTarget();
        pjp.getTarget().getClass().getName();
        log.info("after1");
    }

    @AfterThrowing("execution(* com.k.spring.point..*.*(..))")
    public void afterThrow(JoinPoint pjp) {
        pjp.getArgs();
        pjp.getSignature().getName();
        pjp.getTarget();
        pjp.getTarget().getClass().getName();
        log.info("after1");
    }

    @Around("execution(* com.k.spring.point..*.*(..))")
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
