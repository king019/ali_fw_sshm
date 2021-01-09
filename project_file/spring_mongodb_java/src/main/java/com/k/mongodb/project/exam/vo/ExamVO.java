package com.k.mongodb.project.exam.vo;
import com.k.mongodb.project.exam.model.ExamQuestion;
import java.util.Date;
import java.util.List;
public class ExamVO {
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
