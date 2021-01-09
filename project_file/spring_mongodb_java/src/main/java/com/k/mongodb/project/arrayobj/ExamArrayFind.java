package com.k.mongodb.project.arrayobj;

import com.alibaba.fastjson.JSON;
import com.k.mongodb.project.arrayobj.model.ExamOption;
import com.k.mongodb.project.arrayobj.model.ExamQues;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.WriteResult;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.bson.types.ObjectId;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-mongodb.xml")
public class ExamArrayFind {

  @Resource
  private MongoTemplate mongoTemplate;

  @Test
  @Ignore
  public void test() {
    ExamQues ques = new ExamQues();
    ques.setQuesAns("ans");
    List<ExamOption> opts = new ArrayList<>();
    ExamOption opt1 = new ExamOption();
    opt1.setOptName("optname1");
    opt1.setOptId(new ObjectId().toHexString());
    ExamOption opt2 = new ExamOption();
    opt2.setOptName("optname2");
    opt2.setOptId(new ObjectId().toHexString());
    opts.add(opt1);
    opts.add(opt2);
    ques.setOpts(opts);
    DBCollection dbc = mongoTemplate.getCollection("ceshi");
    String jsonString = JSON.toJSONString(ques);
    BasicDBObject dbobj = JSON.parseObject(jsonString, BasicDBObject.class);
    WriteResult wr = dbc.insert(dbobj);
    System.out.println(wr);
    mongoTemplate.insert(ques);
  }
}
