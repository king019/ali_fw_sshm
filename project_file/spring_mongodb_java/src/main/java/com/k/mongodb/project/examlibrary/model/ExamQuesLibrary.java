package com.k.mongodb.project.examlibrary.model;
import com.k.mongodb.project.examlibrary.model.mvo.ExamOption;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "cs_exam_ques_library")
@TypeAlias("ExamQuesLibrary")
public class ExamQuesLibrary {
  /**
   * 试题id
   */
  @Id
  @Indexed
  private String questionId;
  /**
   * 试题题目
   */
  private String questionContent;
  /**
   * 试题状态
   */
  private Integer questionStatus;
  /**
   * 试题创建时间
   */
  private Date questionCreateTime;
  /**
   * 试题创建人id
   */
  private String questionCreateAgentId;
  /**
   * 试题更新时间
   */
  @Indexed
  private Date questionUpdateTime;
  /**
   * 试题更新人id
   */
  private String questionUpdateAgentId;
  /**
   * 试题排序
   */
  private Integer questionIndex;
  /**
   * 试题答案
   */
  private String questionValues;
  /**
   * 业务线id
   */
  private String bunessId;
  /**
   * 试题类型
   */
  private Integer quesType;
  /**
   * 试题选项
   */
  private List<ExamOption> opts;
  @Transient
  private Integer examId;
  @Transient
  private Integer quesId;
  @Transient
  private Integer quesScore;
  @Transient
  private Integer quesNext;
  public String getQuestionId() {
    return questionId;
  }
  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }
  public String getQuestionContent() {
    return questionContent;
  }
  public void setQuestionContent(String questionContent) {
    this.questionContent = questionContent;
  }
  public Integer getQuestionStatus() {
    return questionStatus;
  }
  public void setQuestionStatus(Integer questionStatus) {
    this.questionStatus = questionStatus;
  }
  public Date getQuestionCreateTime() {
    return questionCreateTime;
  }
  public void setQuestionCreateTime(Date questionCreateTime) {
    this.questionCreateTime = questionCreateTime;
  }
  public String getQuestionCreateAgentId() {
    return questionCreateAgentId;
  }
  public void setQuestionCreateAgentId(String questionCreateAgentId) {
    this.questionCreateAgentId = questionCreateAgentId;
  }
  public Date getQuestionUpdateTime() {
    return questionUpdateTime;
  }
  public void setQuestionUpdateTime(Date questionUpdateTime) {
    this.questionUpdateTime = questionUpdateTime;
  }
  public String getQuestionUpdateAgentId() {
    return questionUpdateAgentId;
  }
  public void setQuestionUpdateAgentId(String questionUpdateAgentId) {
    this.questionUpdateAgentId = questionUpdateAgentId;
  }
  public Integer getQuestionIndex() {
    return questionIndex;
  }
  public void setQuestionIndex(Integer questionIndex) {
    this.questionIndex = questionIndex;
  }
  public String getQuestionValues() {
    return questionValues;
  }
  public void setQuestionValues(String questionValues) {
    this.questionValues = questionValues;
  }
  public String getBunessId() {
    return bunessId;
  }
  public void setBunessId(String bunessId) {
    this.bunessId = bunessId;
  }
  public Integer getQuesType() {
    return quesType;
  }
  public void setQuesType(Integer quesType) {
    this.quesType = quesType;
  }
  public List<ExamOption> getOpts() {
    return opts;
  }
  public void setOpts(List<ExamOption> opts) {
    this.opts = opts;
  }
  public Integer getExamId() {
    return examId;
  }
  public void setExamId(Integer examId) {
    this.examId = examId;
  }
  public Integer getQuesId() {
    return quesId;
  }
  public void setQuesId(Integer quesId) {
    this.quesId = quesId;
  }
  public Integer getQuesScore() {
    return quesScore;
  }
  public void setQuesScore(Integer quesScore) {
    this.quesScore = quesScore;
  }
  public Integer getQuesNext() {
    return quesNext;
  }
  public void setQuesNext(Integer quesNext) {
    this.quesNext = quesNext;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((questionId == null) ? 0 : questionId.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    ExamQuesLibrary other = (ExamQuesLibrary) obj;
    if (questionId == null) {
      if (other.questionId != null) {
        return false;
      }
    } else if (!questionId.equals(other.questionId)) {
      return false;
    }
    return true;
  }
}
