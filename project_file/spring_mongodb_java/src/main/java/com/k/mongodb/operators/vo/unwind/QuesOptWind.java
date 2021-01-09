package com.k.mongodb.operators.vo.unwind;
public class QuesOptWind {
  private String quesId;
  private String quesAns;
  private Integer nums;
  public String getQuesId() {
    return quesId;
  }
  public void setQuesId(String quesId) {
    this.quesId = quesId;
  }
  public String getQuesAns() {
    return quesAns;
  }
  public void setQuesAns(String quesAns) {
    this.quesAns = quesAns;
  }
  public Integer getNums() {
    return nums;
  }
  public void setNums(Integer nums) {
    this.nums = nums;
  }
}
