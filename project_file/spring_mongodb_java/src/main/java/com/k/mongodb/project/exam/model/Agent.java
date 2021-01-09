package com.k.mongodb.project.exam.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//CREATE TABLE `cs_agentinfo` (
//		  `cs_id` varchar(30) NOT NULL,
//		  `cs_name` varchar(45) DEFAULT NULL,
//		  `cs_pwd` varchar(45) DEFAULT NULL,
//		  `cs_status` int(11) DEFAULT NULL,
//		  PRIMARY KEY (`cs_id`)
//		) ENGINE=InnoDB DEFAULT CHARSET=latin1;
@Document(collection = "cscenter")
public class Agent {
  @Id
  private String id;
  private String name;
  private String pwd;
  private Integer status;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getPwd() {
    return pwd;
  }
  public void setPwd(String pwd) {
    this.pwd = pwd;
  }
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }
}
