package com.k.web.mybatis.model;
public class VO {
  private Integer id;
  private String vname;
  public VO() {
    super();
  }
  public VO(Integer id) {
    super();
    this.id = id;
  }
  public VO(Integer id, String vname) {
    super();
    this.id = id;
    this.vname = vname;
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
