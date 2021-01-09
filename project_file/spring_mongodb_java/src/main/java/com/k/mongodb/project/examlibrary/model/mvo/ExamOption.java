package com.k.mongodb.project.examlibrary.model.mvo;
import com.k.mongodb.project.examlibrary.util.anno.MdbAnno;
import org.springframework.data.annotation.Transient;
@MdbAnno(sortby = "optionIndex")
public class ExamOption {
  /**
   * 选项id
   */
  private String optionId;
  /**
   * 选项key
   */
  private String optionKey;
  /**
   * 选项val
   */
  private String optionVal;
  /**
   * 选项排序
   */
  private Integer optionIndex;
  @Transient
  private Integer quesId;
  @Transient
  private Integer optId;
  public String getOptionId() {
    return optionId;
  }
  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }
  public String getOptionKey() {
    return optionKey;
  }
  public void setOptionKey(String optionKey) {
    this.optionKey = optionKey;
  }
  public String getOptionVal() {
    return optionVal;
  }
  public void setOptionVal(String optionVal) {
    this.optionVal = optionVal;
  }
  public Integer getOptionIndex() {
    return optionIndex;
  }
  public void setOptionIndex(Integer optionIndex) {
    this.optionIndex = optionIndex;
  }
  public Integer getQuesId() {
    return quesId;
  }
  public void setQuesId(Integer quesId) {
    this.quesId = quesId;
  }
  public Integer getOptId() {
    return optId;
  }
  public void setOptId(Integer optId) {
    this.optId = optId;
  }
}
