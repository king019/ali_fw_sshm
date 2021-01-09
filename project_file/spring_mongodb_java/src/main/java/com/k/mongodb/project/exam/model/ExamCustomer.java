package com.k.mongodb.project.exam.model;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
//CREATE TABLE `cs_examination_customer` (
//		  `CUSTOMER_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
//		  `EXAM_ID` int(11) NOT NULL COMMENT '考卷id',
//		  `AGENT_ID` varchar(8) NOT NULL COMMENT '坐席工号',
//		  `START_TIME` datetime DEFAULT NULL COMMENT '开始时间',
//		  `END_TIME` datetime DEFAULT NULL COMMENT '结束时间',
//		  `SCORE` int(11) DEFAULT NULL COMMENT '所得分数',
//		  PRIMARY KEY (`CUSTOMER_ID`),
//		  KEY `CS_CS_EXAMINATION_CUSTOMER_FK_idx` (`EXAM_ID`),
//		  CONSTRAINT `CS_CS_EXAMINATION_CUSTOMER_FK` FOREIGN KEY (`EXAM_ID`) REFERENCES `cs_examination` (`EXAM_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
//		) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='坐席填写答案信息表';
@Document(collection = "cscenter")
public class ExamCustomer {
  @Id
  private String id;
  @DBRef(lazy = true)
  private Exam exam;
  private Agent agent;
  private Date startTime;
  private Date endTime;
  private Integer score;
  private List<ExamCustomerAnswer> anss;
  public Exam getExam() {
    return exam;
  }
  public void setExam(Exam exam) {
    this.exam = exam;
  }
  public Agent getAgent() {
    return agent;
  }
  public void setAgent(Agent agent) {
    this.agent = agent;
  }
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }
  public List<ExamCustomerAnswer> getAnss() {
    return anss;
  }
  public void setAnss(List<ExamCustomerAnswer> anss) {
    this.anss = anss;
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
}
