package com.k.mongodb.project.exam.model;
import java.util.List;
//CREATE TABLE `cs_examination_question` (
//		  `QUESTION_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '问题id',
//		  `EXAM_ID` int(11) NOT NULL COMMENT '考卷id',
//		  `QUESTION_CONTENT` varchar(400) DEFAULT NULL COMMENT '问题内容',
//		  `QUESTION_TYPE` int(11) DEFAULT NULL COMMENT '问题类型  1判断 2 单项选择 3 多项选择 4 问答',
//		  `QUESTION_SCORE` int(11) DEFAULT NULL COMMENT '分值',
//		  `QUESTION_VALUES` varchar(1000) DEFAULT NULL COMMENT '正确答案值',
//		  `QUESTION_NEXT` int(11) DEFAULT NULL COMMENT '下一个问题',
//		  `QUESTION_INDEX` int(11) DEFAULT NULL COMMENT '问题排序',
//		  `QUESTION_STATUS` int(11) DEFAULT NULL COMMENT '问题状态0有效1无效',
//		  PRIMARY KEY (`QUESTION_ID`),
//		  KEY `CS_EXAMI_QUESTION_FK_idx` (`EXAM_ID`),
//		  CONSTRAINT `CS_EXAMI_QUESTION_FK` FOREIGN KEY (`EXAM_ID`) REFERENCES `cs_examination` (`EXAM_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
//		) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8 COMMENT='考卷问题表';
public class ExamQuestion {
  private String id;
  private String content;
  private Integer score;
  private String vals;
  private Integer next;
  private Integer index;
  private Integer status;
  private List<ExamOption> opts;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }
  public String getVals() {
    return vals;
  }
  public void setVals(String vals) {
    this.vals = vals;
  }
  public Integer getNext() {
    return next;
  }
  public void setNext(Integer next) {
    this.next = next;
  }
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }
  public List<ExamOption> getOpts() {
    return opts;
  }
  public void setOpts(List<ExamOption> opts) {
    this.opts = opts;
  }
}
