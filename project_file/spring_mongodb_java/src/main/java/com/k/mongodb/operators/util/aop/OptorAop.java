package com.k.mongodb.operators.util.aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class OptorAop {
  @Around("execution(* com.k.mongodb.operators..*(..))")
  public void around(ProceedingJoinPoint pjp) {
    // 调用目标方法之前执行的动作
    System.out.println("调用方法之前: 执行！\n");
    // 调用方法的参数
    Object[] args = pjp.getArgs();
    // 调用的方法名
    String method = pjp.getSignature().getName();
    // 获取目标对象(形如：com.action.admin.LoginAction@1a2467a)
    Object target = pjp.getTarget();
    // 获取目标对象的类名(形如：com.action.admin.LoginAction)
    String targetName = pjp.getTarget().getClass().getName();
    // 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行
    System.out.println(pjp);
  }
}
