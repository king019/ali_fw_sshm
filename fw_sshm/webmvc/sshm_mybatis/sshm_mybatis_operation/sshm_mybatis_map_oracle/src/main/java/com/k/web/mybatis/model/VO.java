package com.k.web.mybatis.model;
public class VO {
  private Integer id;
  private String vname;
  public VO(String vname) {
    super();
    this.vname = vname;
  }
  public VO() {
    super();
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getVname() {
    return vname;
  }
  public void setVname(String vname) {
    this.vname = vname;
  }
}
