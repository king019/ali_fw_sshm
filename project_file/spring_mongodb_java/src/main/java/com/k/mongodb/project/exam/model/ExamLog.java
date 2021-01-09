package com.k.mongodb.project.exam.model;
import java.util.Date;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
//CREATE TABLE `cs_examination_log` (
//		  `LOG_ID` int(11) NOT NULL AUTO_INCREMENT,
//		  `EXAM_ID` int(11) DEFAULT NULL,
//		  `LOG_TIME` datetime DEFAULT NULL,
//		  `LOG_TYPE` int(11) DEFAULT NULL COMMENT '1创建,0更新',
//		  `LOG_AGENT` varchar(20) DEFAULT NULL,
//		  PRIMARY KEY (`LOG_ID`),
//		  KEY `EXAM_ID_FK_idx` (`EXAM_ID`),
//		  CONSTRAINT `EXAM_ID_FK` FOREIGN KEY (`EXAM_ID`) REFERENCES `cs_examination` (`EXAM_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
//		) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
@Document(collection = "cscenter")
public class ExamLog {
  @Id
  private ObjectId id;
  @DBRef(lazy = true)
  private Exam exam;
  private Date time;
  private Integer type;
  private Agent agent;
  public ObjectId getId() {
    return id;
  }
  public void setId(ObjectId id) {
    this.id = id;
  }
  public Exam getExam() {
    return exam;
  }
  public void setExam(Exam exam) {
    this.exam = exam;
  }
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }
  public Agent getAgent() {
    return agent;
  }
  public void setAgent(Agent agent) {
    this.agent = agent;
  }
}
