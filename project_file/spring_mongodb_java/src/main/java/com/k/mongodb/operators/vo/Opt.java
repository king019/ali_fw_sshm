package com.k.mongodb.operators.vo;
import com.k.mongodb.operators.util.clazz.ClazzUtil;
public class Opt {
  private String optId;
  private String optName;
  private String optC1;
  private Integer num;
  public String getOptId() {
    return optId;
  }
  public void setOptId(String optId) {
    this.optId = optId;
  }
  public String getOptName() {
    return optName;
  }
  public void setOptName(String optName) {
    this.optName = optName;
  }
  public String getOptC1() {
    return optC1;
  }
  public void setOptC1(String optC1) {
    this.optC1 = optC1;
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
}
