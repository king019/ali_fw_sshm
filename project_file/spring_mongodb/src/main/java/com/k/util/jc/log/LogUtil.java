package com.k.util.jc.log;
import org.junit.After;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LogUtil {
  protected Logger log = LoggerFactory.getLogger(LogUtil.class);
  @Before
  public void logUp() throws Exception {
    // log = LoggerFactory.getLogger(LogUtil.class);
  }
  @After
  public void tearDown() throws Exception {
  }
}
