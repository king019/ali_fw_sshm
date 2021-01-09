package com.k.mongodb.operators.vo;
import com.k.mongodb.operators.util.clazz.ClazzUtil;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "ques")
@TypeAlias("Ques")
public class Ques {
  @Id
  private String quesId;
  private String quesAns;
  @Indexed
  private Integer num;
  private Integer num1;
  private Integer num2;
  private List<Integer> nums;
  private List<Opt> opts;
  private Date dateOpt;
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
  public List<Opt> getOpts() {
    return opts;
  }
  public void setOpts(List<Opt> opts) {
    this.opts = opts;
  }
  public Integer getNum() {
    return num;
  }
  public void setNum(Integer num) {
    this.num = num;
  }
  @Override
  public String toString() {
    return ClazzUtil.toStr(this);
  }
  public List<Integer> getNums() {
    return nums;
  }
  public void setNums(List<Integer> nums) {
    this.nums = nums;
  }
  public Date getDateOpt() {
    return dateOpt;
  }
  public void setDateOpt(Date dateOpt) {
    this.dateOpt = dateOpt;
  }
  public Integer getNum1() {
    return num1;
  }
  public void setNum1(Integer num1) {
    this.num1 = num1;
  }
  public Integer getNum2() {
    return num2;
  }
  public void setNum2(Integer num2) {
    this.num2 = num2;
  }
}
