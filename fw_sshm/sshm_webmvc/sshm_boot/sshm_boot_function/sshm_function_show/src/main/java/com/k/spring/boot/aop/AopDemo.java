package com.k.spring.boot.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AopDemo {
    private static final String aop = "execution(* com.k.spring.boot.control.*.*(..))";

    @Before("execution(* com.k.spring.boot.control.*.*(..))")
    public void befer(final JoinPoint pjp) {
        pjp.getArgs();
        pjp.getSignature().getName();
        pjp.getTarget();
        pjp.getTarget().getClass().getName();
        log.info("befer1");
    }

    @Before(aop)
    public void befer() {
        log.info("befer2");
    }

    @After(aop)
    public void after() {
        log.info("after2");
    }

    @After(aop)
    public void after(final JoinPoint pjp) {
        pjp.getArgs();
        pjp.getSignature().getName();
        pjp.getTarget();
        pjp.getTarget().getClass().getName();
        log.info("after1");
    }

    @Around(aop)
    public Object around(final ProceedingJoinPoint pjp) {
        // 调用目标方法之前执行的动作
        log.info("调用方法之前: 执行！\n");
        pjp.getArgs();
        pjp.getSignature().getName();
        pjp.getTarget();
        pjp.getTarget().getClass().getName();
        // 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行
        log.info("", pjp);
        log.info("around");
        try {
            return pjp.proceed();
        } catch (final Throwable e) {
            e.printStackTrace();
        }
        return null;
    }
}
