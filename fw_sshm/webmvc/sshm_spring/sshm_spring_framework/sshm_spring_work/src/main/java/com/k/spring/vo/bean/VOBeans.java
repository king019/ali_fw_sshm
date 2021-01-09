package com.k.spring.vo.bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VOBeans {
  // @Value("file_root")
  public String name;
  private void init() {
    log.info("init");
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
