package com.k.spring.test.anno;

import com.k.spring.schedule.TaskAsync;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml", "classpath:spring/anno/*.xml"})
public class AnnoAsyncTest {

  @Resource
  private TaskAsync taskAsync;

  @Test
  @Ignore
  public void test() {
    try {
      Thread.sleep(1000);
      log.info("start");
      taskAsync.async();
      log.info("end");
      Thread.sleep(200000);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
