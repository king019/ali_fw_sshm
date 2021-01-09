package com.k.mongodb.project.examlibrary.model;
import com.k.mongodb.project.examlibrary.util.anno.MdbAnno;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "cs_exam_buness")
@TypeAlias("ExamBuness")
@MdbAnno(id = "bunessId")
public class ExamBuness {
  /**
   * 业务线id
   */
  @Id
  @Indexed
  private String bunessId;
  /**
   * 业务线名称
   */
  private String bunessName;
  /**
   * 业务线状态
   */
  private Integer bunessStatus;
  /**
   * 业务线创建时间
   */
  private Date bunessCreateTime;
  /**
   * 创建时间格式化
   */
  @Transient
  private String bunessCreateTimeFormat;
  /**
   * 业务线创建人id
   */
  private String bunessCreateAgentId;
  /**
   * 业务线更新时间
   */
  private Date bunessUpdateTime;
  /**
   * 业务线更新时间格式化
   */
  @Transient
  private String bunessUpdateTimeFormat;
  /**
   * 业务线更新人id
   */
  private String bunessUpdateAgentId;
  /**
   * 业务线排序
   */
  private Integer bunessIndex;
  public String getBunessId() {
    return bunessId;
  }
  public void setBunessId(String bunessId) {
    this.bunessId = bunessId;
  }
  public String getBunessName() {
    return bunessName;
  }
  public void setBunessName(String bunessName) {
    this.bunessName = bunessName;
  }
  public Integer getBunessStatus() {
    return bunessStatus;
  }
  public void setBunessStatus(Integer bunessStatus) {
    this.bunessStatus = bunessStatus;
  }
  public Date getBunessCreateTime() {
    return bunessCreateTime;
  }
  public void setBunessCreateTime(Date bunessCreateTime) {
    this.bunessCreateTime = bunessCreateTime;
  }
  public String getBunessCreateAgentId() {
    return bunessCreateAgentId;
  }
  public void setBunessCreateAgentId(String bunessCreateAgentId) {
    this.bunessCreateAgentId = bunessCreateAgentId;
  }
  public Date getBunessUpdateTime() {
    return bunessUpdateTime;
  }
  public void setBunessUpdateTime(Date bunessUpdateTime) {
    this.bunessUpdateTime = bunessUpdateTime;
  }
  public String getBunessUpdateAgentId() {
    return bunessUpdateAgentId;
  }
  public void setBunessUpdateAgentId(String bunessUpdateAgentId) {
    this.bunessUpdateAgentId = bunessUpdateAgentId;
  }
  public Integer getBunessIndex() {
    return bunessIndex;
  }
  public void setBunessIndex(Integer bunessIndex) {
    this.bunessIndex = bunessIndex;
  }
  public String getBunessCreateTimeFormat() {
    return bunessCreateTimeFormat;
  }
  public void setBunessCreateTimeFormat(String bunessCreateTimeFormat) {
    this.bunessCreateTimeFormat = bunessCreateTimeFormat;
  }
  public String getBunessUpdateTimeFormat() {
    return bunessUpdateTimeFormat;
  }
  public void setBunessUpdateTimeFormat(String bunessUpdateTimeFormat) {
    this.bunessUpdateTimeFormat = bunessUpdateTimeFormat;
  }
}
