package com.k.mongodb.project.exam.model;
import org.springframework.data.mongodb.core.index.Indexed;
//CREATE TABLE `cs_examination_option` (
//		  `OPTION_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '答案id',
//		  `QUESTION_ID` int(11) NOT NULL COMMENT '问题id',
//		  `OPTION_KEY` varchar(200) DEFAULT NULL COMMENT '答案选项名称',
//		  `OPTION_VALUE` varchar(200) DEFAULT NULL COMMENT '答案选项值',
//		  `OPTION_INDEX` int(11) DEFAULT NULL COMMENT '答案选项排序',
//		  PRIMARY KEY (`OPTION_ID`),
//		  KEY `CS_CS_EXAMINATION_OPTION_FK_idx` (`QUESTION_ID`),
//		  CONSTRAINT `CS_CS_EXAMINATION_OPTION_FK` FOREIGN KEY (`QUESTION_ID`) REFERENCES `cs_examination_question` (`QUESTION_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
//		) ENGINE=InnoDB AUTO_INCREMENT=232 DEFAULT CHARSET=utf8 COMMENT='考试答案选项表';
public class ExamOption {
  @Indexed
  public String id;
  public String key;
  public String vals;
  private Integer index;
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }
  public String getVals() {
    return vals;
  }
  public void setVals(String vals) {
    this.vals = vals;
  }
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
}
