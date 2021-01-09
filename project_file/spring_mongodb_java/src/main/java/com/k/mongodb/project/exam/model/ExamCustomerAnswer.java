package com.k.mongodb.project.exam.model;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
//CREATE TABLE `cs_examination_customer_answer` (
//		  `ANSWER_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
//		  `CUSTOMER_ID` int(11) NOT NULL COMMENT '答题id',
//		  `QUESTION_ID` int(11) NOT NULL COMMENT '问题id',
//		  `ANSWER_VALUES` varchar(1000) DEFAULT NULL COMMENT '答案值',
//		  `QUESTION_SCORE` int(11) DEFAULT NULL COMMENT '问答题分数(只包含问答题)',
//		  PRIMARY KEY (`ANSWER_ID`),
//		  KEY `CS_EXAMINATION_CUSTOMER_FK_idx` (`CUSTOMER_ID`),
//		  KEY `CS_EXAMINATION_CUSTOMER_FK1_idx` (`QUESTION_ID`),
//		  CONSTRAINT `CS_EXAMINATION_CUSTOMER_FK` FOREIGN KEY (`CUSTOMER_ID`) REFERENCES `cs_examination_customer` (`CUSTOMER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
//		  CONSTRAINT `CS_EXAMINATION_CUSTOMER_FK1` FOREIGN KEY (`QUESTION_ID`) REFERENCES `cs_examination_question` (`QUESTION_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
//		) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COMMENT='坐席填写答案表';
public class ExamCustomerAnswer {
  @Indexed
  private ObjectId id;
  private Agent agent;
  @DBRef(lazy = true)
  private ExamQuestion ques;
  private String vals;
  private Integer score;
  public ObjectId getId() {
    return id;
  }
  public void setId(ObjectId id) {
    this.id = id;
  }
  public Agent getAgent() {
    return agent;
  }
  public void setAgent(Agent agent) {
    this.agent = agent;
  }
  public ExamQuestion getQues() {
    return ques;
  }
  public void setQues(ExamQuestion ques) {
    this.ques = ques;
  }
  public String getVals() {
    return vals;
  }
  public void setVals(String vals) {
    this.vals = vals;
  }
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }
}
