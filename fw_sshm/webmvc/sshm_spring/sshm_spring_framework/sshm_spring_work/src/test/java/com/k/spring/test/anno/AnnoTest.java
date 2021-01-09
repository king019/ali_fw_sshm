package com.k.spring.test.anno;

import com.k.spring.aop.point.anno.AopPointTest;
import com.k.spring.factory.MyFactoryBean;
import com.k.spring.util.UtilDemo;
import com.k.spring.vo.enumtype.EnumVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml", "classpath:spring/anno/*.xml"})
public class AnnoTest {

  @Resource
  private AopPointTest aopPointTest;
  @Resource(name = "utilDemoXml")
  private UtilDemo demo;
  @Resource(name = "myFactoryBean")
  private String myFactoryBeanStr;
  @Resource(name = "&myFactoryBean")
  private MyFactoryBean myFactoryBean;

  @Test
  @Ignore
  public void test() {
    EnumVO vo = AnnotationUtils.findAnnotation(UtilDemo.class, EnumVO.class);
    log.info(demo.getFilePathAnnoXml());
    aopPointTest.aoptest();
  }
}
