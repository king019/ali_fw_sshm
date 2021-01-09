package com.k.ceshi.nosql.mongodb.util.vo;
public class AddressVO {
  private String host;
  private int port;
  private int priority;
  private String rep;
  private String repName;
  public AddressVO() {
  }
  public AddressVO(String host, int port) {
    super();
    this.host = host;
    this.port = port;
  }
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }
  public int getPort() {
    return port;
  }
  public void setPort(int port) {
    this.port = port;
  }
  public int getPriority() {
    return priority;
  }
  public void setPriority(int priority) {
    this.priority = priority;
  }
  public String getRep() {
    return rep;
  }
  public void setRep(String rep) {
    this.rep = rep;
  }
  public String getRepName() {
    return repName;
  }
  public void setRepName(String repName) {
    this.repName = repName;
  }
}
