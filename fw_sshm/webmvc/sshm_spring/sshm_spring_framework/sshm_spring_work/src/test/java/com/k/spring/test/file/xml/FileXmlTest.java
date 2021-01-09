package com.k.spring.test.file.xml;


import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@Slf4j
public class FileXmlTest {

  @Test
  @Ignore
  public void test() {
    FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring/spring-*.xml", "classpath:spring/anno/*.xml");
    log.info("",context);
  }
}
