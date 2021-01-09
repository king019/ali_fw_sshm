package com.k.mongodb.project.exam.model;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
//CREATE TABLE `cs_examination` (
//		  `EXAM_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '考卷id',
//		  `EXAM_NAME` varchar(50) DEFAULT NULL COMMENT '考卷名称',
//		  `EXAM_STATUS` int(11) DEFAULT NULL COMMENT '考卷状态 0可用 1 不可用',
//		  `EXAM_TIME` int(11) DEFAULT NULL COMMENT '考试时间',
//		  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
//		  `CREATE_AGENT` varchar(20) DEFAULT NULL COMMENT '创建者',
//		  `BEGIN_TIME` datetime DEFAULT NULL COMMENT '有效期开始时间',
//		  `END_TIME` datetime DEFAULT NULL COMMENT '有效期结束时间',
//		  `EXAM_TYPE` int(11) DEFAULT NULL COMMENT '0模板,1考试试题',
//		  `EXAM_SCORE` int(11) DEFAULT NULL COMMENT '考试分数',
//		  PRIMARY KEY (`EXAM_ID`)
//		)
@Document(collection = "exam")
public class Exam {
  @Indexed
  @Id
  private String id;
  private String name;
  private Integer time;
  private String agent;
  private Date beginTime;
  private Date endTime;
  private Integer type;
  private Integer score;
  private Integer ix;
  private List<ExamQuestion> quess;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Integer getTime() {
    return time;
  }
  public void setTime(Integer time) {
    this.time = time;
  }
  public String getAgent() {
    return agent;
  }
  public void setAgent(String agent) {
    this.agent = agent;
  }
  public Date getBeginTime() {
    return beginTime;
  }
  public void setBeginTime(Date beginTime) {
    this.beginTime = beginTime;
  }
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }
  public List<ExamQuestion> getQuess() {
    return quess;
  }
  public void setQuess(List<ExamQuestion> quess) {
    this.quess = quess;
  }
  public Integer getIx() {
    return ix;
  }
  public void setIx(Integer ix) {
    this.ix = ix;
  }
}
