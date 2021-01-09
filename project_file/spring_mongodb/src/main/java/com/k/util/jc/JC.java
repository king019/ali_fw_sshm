package com.k.util.jc;

import com.k.mongo.dao.MongoDao;
import com.k.util.jc.log.LogUtil;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

public abstract class JC extends LogUtil {

  protected Mongo mc;
  protected DB db;
  protected DBCollection cs;
  protected MongoTemplate mongoTemplate;
  protected MongoDao mongoDao;

  @Before
  public void setUp() throws Exception {
    try {
      ApplicationContext wc = new ClassPathXmlApplicationContext("classpath:/spring*.xml");
      mongoTemplate = (MongoTemplate) wc.getBean("mongoTemplate");
      mc = (Mongo) wc.getBean("mc");
      mongoDao = wc.getBean(MongoDao.class);
      db = mc.getDB("test");
      cs = db.getCollection("cs");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  @Override
  @After
  public void tearDown() throws Exception {
  }

  @Test
  @Ignore
  public abstract void test();
}
