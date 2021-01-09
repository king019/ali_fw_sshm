package com.k.spring.test.xml;

import com.k.spring.aop.point.xml.AopPointTest;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml", "classpath:spring/xml/spring-*.xml"})
// @ContextConfiguration(locations = {"classpath:spring/xml/*.xml"})
public class XmlTest {

  @Resource
  private AopPointTest aopPointTest;

  @Test
  @Ignore
  public void test() {
    aopPointTest.aoptest();
  }
}
