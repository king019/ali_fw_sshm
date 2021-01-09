package com.k.mongodb.project.examlibrary.util.em;
public enum MdbSort {
  ASC(1), DESC(0);
  private Integer st;
  private MdbSort(Integer st) {
    this.st = st;
  }
  public Integer getSt() {
    return st;
  }
  public void setSt(Integer st) {
    this.st = st;
  }
}
