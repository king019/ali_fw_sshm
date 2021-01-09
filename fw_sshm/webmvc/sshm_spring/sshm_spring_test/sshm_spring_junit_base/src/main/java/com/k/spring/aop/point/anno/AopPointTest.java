package com.k.spring.aop.point.anno;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
@Component@Slf4j
public class AopPointTest {
  public void aoptest1() {
    log.info("aoptest1");
    this.aoptest2();
  }
  public void aoptest2() {
    log.info("aoptest2");
  }
  public void aoptest3() {
    log.info("aoptest3");
  }
}
