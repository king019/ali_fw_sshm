package com.k.spring.util;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class UtilDemo {
  private String filePathXml;
  @Value("#{prop['file_root']}")
  private String filePathAnno;
  // @Value("#{file_root}")错误
  private String filePathAnnoXml;
  public String getFilePathXml() {
    return filePathXml;
  }
  public void setFilePathXml(String filePathXml) {
    this.filePathXml = filePathXml;
  }
  public String getFilePathAnno() {
    return filePathAnno;
  }
  public void setFilePathAnno(String filePathAnno) {
    this.filePathAnno = filePathAnno;
  }
  public String getFilePathAnnoXml() {
    return filePathAnnoXml;
  }
  public void setFilePathAnnoXml(String filePathAnnoXml) {
    this.filePathAnnoXml = filePathAnnoXml;
  }
}
