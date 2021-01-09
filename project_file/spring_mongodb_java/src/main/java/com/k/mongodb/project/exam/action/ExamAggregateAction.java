package com.k.mongodb.project.exam.action;

import com.k.mongodb.project.exam.model.Exam;
import com.k.mongodb.project.exam.vo.ExamVO;
import java.util.Iterator;
import javax.annotation.Resource;
import org.apache.log4j.Logger;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.*;
import org.springframework.data.mongodb.core.aggregation.GroupOperation.GroupOperationBuilder;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-mongodb.xml")
public class ExamAggregateAction {

  private Logger logger = Logger.getLogger(ExamAggregateAction.class);
  @Resource
  private MongoTemplate mongoTemplate;

  @Test
  @Ignore
  public void test() {
    CriteriaDefinition criteria = new Criteria();
    try {
      MatchOperation match = new MatchOperation(criteria);
      Fields fields = Fields.fields("ix");
      GroupOperation group = new GroupOperation(fields);
      GroupOperationBuilder builder = group.sum("ix");
      group = builder.as("agent");
      SkipOperation skip = new SkipOperation(0);
      Sort sort1 = new Sort("ix");
      Sort sort2 = new Sort("name");
      SortOperation so = new SortOperation(sort1);
      so = so.and(sort2);
      TypedAggregation<Exam> aggregation = new TypedAggregation<Exam>(Exam.class, so, group, skip);
      AggregationResults<ExamVO> ret = mongoTemplate.aggregate(aggregation, ExamVO.class);
      ExamVO exam;
      Iterator<ExamVO> it = ret.iterator();
      while (it.hasNext()) {
        exam = it.next();
        System.out.println(exam);
      }
      System.out.println(ret);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Ignore
  @Test
  public void test1() {
    try {
      Fields fields = Fields.fields("name");
      GroupOperation group = new GroupOperation(fields);
      GroupOperationBuilder builder = group.count();
      group = builder.as("agent");
      SkipOperation skip = new SkipOperation(0);
      Sort sort1 = new Sort("ix");
      Sort sort2 = new Sort("name");
      SortOperation so = new SortOperation(sort1);
      // so = so.and(sort2);
      TypedAggregation<Exam> aggregation = new TypedAggregation<Exam>(Exam.class, so, group, skip);
      AggregationResults<Exam> ret = mongoTemplate.aggregate(aggregation, Exam.class);
      // TypedAggregation<ZipInfo> aggregation = new Aggregation(ZipInfo.class, group("state", "city").sum("population").as("pop"), sort(ASC, "pop", "state", "city"), group("state").last("city").as("biggestCity").last("pop").as("biggestPop").first("city").as("smallestCity").first("pop").as("smallestPop"), project().and("state").previousOperation().and("biggestCity").nested(bind("name", "biggestCity").and("population", "biggestPop")).and("smallestCity").nested(bind("name", "smallestCity").and("population", "smallestPop")), sort(ASC, "state"));
      // AggregationResults<ZipInfoStats> result = mongoTemplate.aggregate(aggregation, ZipInfoStats.class);
      // ZipInfoStats firstZipInfoStats = result.getMappedResults().get(0);
      System.out.println(ret);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  class ZipInfo {

    String id;
    String city;
    String state;
    @Field("pop")
    int population;
    @Field("loc")
    double[] location;
  }

  class City {

    String name;
    int population;
  }

  class ZipInfoStats {

    String id;
    String state;
    City biggestCity;
    City smallestCity;
  }
}
