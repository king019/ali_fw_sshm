package com.k.spring.aop.anno;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
// com.k.spring.aop.point.anno
public class AopDemo {
    // @Before("execution(* com.k.spring.aop.point..*.*(..))")
    public void befer(JoinPoint pjp) {
        Object[] args = pjp.getArgs();
        // 调用的方法名
        String method = pjp.getSignature().getName();
        // 获取目标对象(形如：com.action.admin.LoginAction@1a2467a)
        Object target = pjp.getTarget();
        // 获取目标对象的类名(形如：com.action.admin.LoginAction)
        String targetName = pjp.getTarget().getClass().getName();
        log.info("befer1");
    }

    // @Before("execution(* com.k.spring.aop.point..*.*(..))")
    public void befer() {
        log.info("befer2");
    }

    // @After("execution(* com.k.spring.aop.point..*.*(..))")
    public void after() {
        log.info("after2");
    }

    // @After("execution(* com.k.spring.aop.point..*.*(..))")
    public void after(JoinPoint pjp) {
        Object[] args = pjp.getArgs();
        // 调用的方法名
        String method = pjp.getSignature().getName();
        // 获取目标对象(形如：com.action.admin.LoginAction@1a2467a)
        Object target = pjp.getTarget();
        // 获取目标对象的类名(形如：com.action.admin.LoginAction)
        String targetName = pjp.getTarget().getClass().getName();
        log.info("after1");
    }

    @Around("execution(* com.k.spring.aop.point..*.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        // 调用目标方法之前执行的动作
        log.info("调用方法之前: 执行！\n");
        // 调用方法的参数
        Object[] args = pjp.getArgs();
        // 调用的方法名
        String method = pjp.getSignature().getName();
        // 获取目标对象(形如：com.action.admin.LoginAction@1a2467a)
        Object target = pjp.getTarget();
        // 获取目标对象的类名(形如：com.action.admin.LoginAction)
        String targetName = pjp.getTarget().getClass().getName();
        // 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行
        log.info("", pjp);
        log.info("aroundbefer");
        pjp.proceed();
        log.info("aroundafter");
    }
}
