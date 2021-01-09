package com.k.mongodb.project.test;

import com.alibaba.fastjson.JSON;
import com.k.mongodb.project.exam.model.Exam;
import com.k.mongodb.project.exam.model.ExamOption;
import com.k.mongodb.project.exam.model.ExamQuestion;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.WriteResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.bson.types.ObjectId;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-mongodb.xml")
public class TestAction {

  private Logger logger = Logger.getLogger(TestAction.class);
  @Resource
  private MongoTemplate mongoTemplate;

  // @Ignore
  @Test
  @Ignore
  public void test() {
    for (int i = 0; i < 1; i++) {
      insertOne(i);
      System.out.println("index:" + i);
    }
  }

  public void insertOne(Integer index) {
    Exam exam = new Exam();
    exam.setName("exam1");
    exam.setIx(index);
    exam.setAgent("agent" + System.currentTimeMillis());
    exam.setBeginTime(new Date());
    exam.setEndTime(new Date());
    List<ExamQuestion> quess = new ArrayList<>();
    ExamQuestion ques;
    List<ExamOption> opts = new ArrayList<>();
    ExamOption opt;
    for (int i = 0; i < 3; i++) {
      ques = new ExamQuestion();
      ques.setId(new ObjectId().toHexString());
      ques.setContent("ques" + System.currentTimeMillis());
      {
        opts = new ArrayList<>();
        for (int j = 0; j < 3; j++) {
          opt = new ExamOption();
          opt.setId(new ObjectId().toHexString());
          opt.setKey("key" + System.currentTimeMillis());
          opt.setVals("val" + System.currentTimeMillis());
          opts.add(opt);
        }
        ques.setOpts(opts);
      }
      quess.add(ques);
    }
    // exam.setQuess(quess);
    logger.info(exam);
    try {
      String jsonString = JSON.toJSONString(exam);
      BasicDBObject dbo = JSON.parseObject(jsonString, BasicDBObject.class);
      DBCollection dbc = mongoTemplate.getCollection("exam");
      WriteResult wr = dbc.insert(dbo);
      System.out.println(wr);
      // mongoTemplate.insert(exam);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
