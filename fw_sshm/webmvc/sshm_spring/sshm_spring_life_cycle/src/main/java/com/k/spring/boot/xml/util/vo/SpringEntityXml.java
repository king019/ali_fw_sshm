package com.k.spring.boot.xml.util.vo;

import com.k.spring.boot.anno.util.vo.SpringEntityAnno;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class SpringEntityXml implements InitializingBean {
  private String className = SpringEntityAnno.class.getName();
  @PostConstruct
  private void init() {
    log.info(className.concat("@PostConstruct"));
  }
  @PreDestroy
  private void destroy() {
    log.info(className.concat("@PreDestroy"));
  }
  @Override
  public void afterPropertiesSet() throws Exception {
    log.info(className.concat("@afterPropertiesSet"));
  }
}
