package com.k.spring.aop.xml;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

@Slf4j
public class AopXmlDemo {
    public void befer(JoinPoint pjp) {
        Object[] args = pjp.getArgs();
        log.info("", args);
        // 调用的方法名
        String method = pjp.getSignature().getName();
        // 获取目标对象(形如：com.action.admin.LoginAction@1a2467a)
        Object target = pjp.getTarget();
        // 获取目标对象的类名(形如：com.action.admin.LoginAction)
        String targetName = pjp.getTarget().getClass().getName();
        log.info("befer");
    }

    // public void befer() {
    // log.info("befer");
    // }
    public void after() {
        log.info("after");
    }

    public void after(JoinPoint pjp) {
        Object[] args = pjp.getArgs();
        // 调用的方法名
        String method = pjp.getSignature().getName();
        // 获取目标对象(形如：com.action.admin.LoginAction@1a2467a)
        Object target = pjp.getTarget();
        // 获取目标对象的类名(形如：com.action.admin.LoginAction)
        String targetName = pjp.getTarget().getClass().getName();
        log.info("after");
    }

    public void around(ProceedingJoinPoint pjp) {
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
        log.info("around");
    }
}
