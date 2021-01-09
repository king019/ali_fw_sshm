package com.k.mongodb.project.exam.action;

import com.k.mongodb.project.exam.model.Exam;
import com.k.mongodb.project.exam.model.ExamOption;
import com.k.mongodb.project.exam.model.ExamQuestion;
import com.k.mongodb.project.exam.service.UtilFindService;
import com.k.mongodb.project.exam.service.UtilService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.bson.types.ObjectId;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.data.mongodb.core.mapreduce.GroupBy;
import org.springframework.data.mongodb.core.mapreduce.GroupByResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-mongodb.xml")
public class ExamAction {

  private Logger logger = Logger.getLogger(ExamAction.class);
  @Resource
  private UtilService utilService;
  @Resource
  private UtilFindService utilFindService;

  // @Ignore
  @Test
  @Ignore
  public void test() {
    for (int i = 0; i < 1; i++) {
      insertList(i, 1);
      System.out.println("index:" + i);
    }
  }

  public void insertList(Integer index, int count) {
    Exam exam = new Exam();
    String id = new ObjectId().toHexString();
    System.out.println(id);
    exam.setId(id);
    exam.setName("exam1");
    exam.setIx(index);
    exam.setAgent("agent" + System.currentTimeMillis());
    exam.setBeginTime(new Date());
    exam.setEndTime(new Date());
    List<ExamQuestion> quess = new ArrayList<ExamQuestion>();
    ExamQuestion ques;
    List<ExamOption> opts = new ArrayList<ExamOption>();
    ExamOption opt;
    // exam.setQuess(quess);
    logger.info(exam);
    List<Exam> list = new ArrayList<Exam>();
    for (int i = 0; i < count; i++) {
      exam.setName(index + ":" + System.currentTimeMillis());
      list.add(exam);
    }
    try {
      utilService.inserts(list);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void insertOne(Integer index) {
    Exam exam = new Exam();
    exam.setName("exam1");
    exam.setIx(index);
    exam.setAgent("agent" + System.currentTimeMillis());
    exam.setBeginTime(new Date());
    exam.setEndTime(new Date());
    List<ExamQuestion> quess = new ArrayList<ExamQuestion>();
    ExamQuestion ques;
    List<ExamOption> opts = new ArrayList<ExamOption>();
    ExamOption opt;
    for (int i = 0; i < 3; i++) {
      ques = new ExamQuestion();
      ques.setId(new ObjectId().toHexString());
      ques.setContent("ques" + System.currentTimeMillis());
      {
        opts = new ArrayList<ExamOption>();
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
      utilService.insert(exam);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Ignore
  @Test
  public void search() {
    Query query = new Query();
    try {
      List<Exam> list = utilFindService.find(query, Exam.class);
      logger.info(list);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Ignore
  @Test
  public void update() {
    Query query = new Query();
    Criteria criteria = new Criteria();
    criteria.and("name").is("exam1407938824657");
    query.addCriteria(criteria);
    logger.info(query);
    Update update = new Update();
    update.set("quess.[0].opts.[0].key", "quessoptskey");
    update.set("agent", "agent123");
    logger.info(update);
    try {
      utilService.updateFirst(query, update, Exam.class);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Ignore
  @Test
  public void groupby() {
    try {
      Criteria criteria = new Criteria();
      GroupBy groupBy = new GroupBy("id");
      groupBy.initialDocument("{ct:1}");
      groupBy.reduceFunction("function(doc,pre){doc.ct++}");
      // groupBy.finalizeFunction("function(pre){}");
      GroupByResults<Exam> exams = utilService.group("exam", groupBy, Exam.class);
      System.out.println(exams);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void like() {
    Criteria criteria = new Criteria();
    criteria.and("questionContent").regex(".*?机器测试.*");
    Query query = new Query(criteria);
    // query.limit(10);
    try {
      List<Exam> list = utilFindService.find(query, Exam.class);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
