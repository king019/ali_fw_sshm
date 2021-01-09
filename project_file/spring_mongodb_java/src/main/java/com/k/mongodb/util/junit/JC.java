package com.k.mongodb.util.junit;

import javax.annotation.Resource;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-mongodb.xml")
public abstract class JC {

  @Rule
  public TestName name = new TestName();
  @Resource
  public MongoTemplate mongoTemplate;

  @Before
  public void setUp() throws Exception {
  }

  // @Test @Ignore
  // public abstract void test();
  @After
  public void tearDown() throws Exception {
  }
}
