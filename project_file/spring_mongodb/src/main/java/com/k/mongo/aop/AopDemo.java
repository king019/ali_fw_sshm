package com.k.mongo.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AopDemo {
  // @Before("execution(* com.k.mongo..*.*(..))")
  public void befer(JoinPoint pjp) {
    Object[] args = pjp.getArgs();
    // 调用的方法名
    String method = pjp.getSignature().getName();
    // 获取目标对象(形如：com.action.admin.LoginAction@1a2467a)
    Object target = pjp.getTarget();
    // 获取目标对象的类名(形如：com.action.admin.LoginAction)
    String targetName = pjp.getTarget().getClass().getName();
    System.out.println("befer1");
  }
  // @Before("execution(* com.k.mongo..*.*(..))")
  public void befer() {
    System.out.println("befer2");
  }
  // @After("execution(* com.k.mongo..*.*(..))")
  public void after() {
    System.out.println("after2");
  }
  // @After("execution(* com.k.mongo..*.*(..))")
  public void after(JoinPoint pjp) {
    Object[] args = pjp.getArgs();
    // 调用的方法名
    String method = pjp.getSignature().getName();
    // 获取目标对象(形如：com.action.admin.LoginAction@1a2467a)
    Object target = pjp.getTarget();
    // 获取目标对象的类名(形如：com.action.admin.LoginAction)
    String targetName = pjp.getTarget().getClass().getName();
    System.out.println("after1");
  }
  @Around("execution(* com.k.mongo..*.*(..))")
  public void around(ProceedingJoinPoint pjp) {
    // 调用目标方法之前执行的动作
    // System.out.println("调用方法之前: 执行！\n");
    // 调用方法的参数
    Object[] args = pjp.getArgs();
    // 调用的方法名
    // String method = pjp.getSignature() ;
    // 获取目标对象(形如：com.action.admin.LoginAction@1a2467a)
    Object target = pjp.getTarget();
    // 获取目标对象的类名(形如：com.action.admin.LoginAction)
    String targetName = pjp.getTarget().getClass().getName();
    // 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行
    try {
      long start = System.currentTimeMillis();
      pjp.proceed();
      long end = System.currentTimeMillis();
      System.out.println("*****************" + pjp.getSignature() + "*********start****************************");
      System.out.println(pjp.getSignature() + "程序执行时间(ms):" + (end - start));
      System.out.println("****************" + pjp.getSignature() + "***********end***************************");
    } catch (Throwable e) {
      e.printStackTrace();
    }
  }
  @Around("execution(* com.k.util..*.*(..))")
  public void aroundJC(ProceedingJoinPoint pjp) {
    // 调用目标方法之前执行的动作
    // System.out.println("调用方法之前: 执行！\n");
    // 调用方法的参数
    Object[] args = pjp.getArgs();
    // 调用的方法名
    // String method = pjp.getSignature() ;
    // 获取目标对象(形如：com.action.admin.LoginAction@1a2467a)
    Object target = pjp.getTarget();
    // 获取目标对象的类名(形如：com.action.admin.LoginAction)
    String targetName = pjp.getTarget().getClass().getName();
    // 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行
    try {
      long start = System.currentTimeMillis();
      pjp.proceed();
      long end = System.currentTimeMillis();
      System.out.println("*****************" + pjp.getSignature() + "*********start****************************");
      System.out.println(pjp.getSignature() + "程序执行时间(ms):" + (end - start));
      System.out.println("****************" + pjp.getSignature() + "***********end***************************");
    } catch (Throwable e) {
      e.printStackTrace();
    }
  }
}
