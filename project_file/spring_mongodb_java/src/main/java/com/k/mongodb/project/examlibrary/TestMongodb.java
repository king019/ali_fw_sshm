package com.k.mongodb.project.examlibrary;

import com.k.mongodb.project.exam.service.UtilService;
import com.k.mongodb.project.examlibrary.model.ExamQuesLibrary;
import java.util.Map;
import javax.annotation.Resource;
import org.bson.types.ObjectId;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-mongodb.xml")
public class TestMongodb {

  @Resource
  private UtilService utilService;

  @Test
  @Ignore
  public void test() {
    try {
      ExamQuesLibrary examQuesLibrary = new ExamQuesLibrary();
      examQuesLibrary.setQuestionId(new ObjectId().toHexString());
      Map map = utilService.insert(examQuesLibrary);
      System.out.println(map);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
