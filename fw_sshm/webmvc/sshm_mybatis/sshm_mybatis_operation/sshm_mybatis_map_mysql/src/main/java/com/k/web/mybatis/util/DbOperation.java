package com.k.web.mybatis.util;
public enum DbOperation {
  df1("df1"), df2("df2"), df3("df3");
  private String val;
  DbOperation(String val) {
    this.val = val;
  }
  public String getVal() {
    return val;
  }
  public void setVal(String val) {
    this.val = val;
  }
}
