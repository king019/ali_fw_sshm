package com.k.mongodb.project.exam.model;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//CREATE TABLE `cs_examination_group` (
//		  `ID` int(11) NOT NULL AUTO_INCREMENT,
//		  `EXAM_ID` int(11) DEFAULT NULL,
//		  `GROUP_ID` int(11) DEFAULT NULL,
//		  PRIMARY KEY (`ID`)
//		) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
@Document(collection = "cscenter")
public class ExamGroup {
  @Id
  private ObjectId id;
  private Exam exam;
  private Integer groupId;
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
  public Integer getGroupId() {
    return groupId;
  }
  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }
}
