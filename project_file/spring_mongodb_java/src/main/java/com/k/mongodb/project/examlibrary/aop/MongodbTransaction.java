package com.k.mongodb.project.examlibrary.aop;
import com.k.mongodb.project.examlibrary.util.SysProperty;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MongodbTransaction {
  @Resource
  private MongoTemplate mongoTemplate;
  // @Around("execution(* com.k.mongodb.exam.service.UtilService..*.*(..))")
  @Around("execution(* com.k.mongodb.exam.service..*(..))")
  public Object around(ProceedingJoinPoint pjp) {
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
    Map map = new HashMap();
    Map maptemp;
    try {
      maptemp = (Map) pjp.proceed();
      if (maptemp != null) {
        map.putAll(maptemp);
      }
      map.put(SysProperty.retKey, true);
    } catch (Throwable e) {
    }
    return map;
  }
  private boolean insertAspect(Object object) {
    Query query = new Query();
    Criteria criteria = new Criteria();
    mongoTemplate.find(query, object.getClass());
    return false;
  }
  private boolean updateAspect(Object src, Object des) {
    return false;
  }
  private boolean removeAspect(Object object) {
    return false;
  }
}
