package com.k.mongo.vo;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "cs")
// @CompoundIndexes({@CompoundIndex(name = "id", def = "{pre_id:1,sub_id:1}")})
// @TypeAlias("persion")
public class Persion implements Serializable {
  @Id
  private String id;
  private Long pre_id;
  private Integer num;
  private Long sub_id;
  private String name;
  private Account account;
  private List<Account> accounts;
  // @DBRef(db = "cs", lazy = true)
  // private Persion persion;
  public Long getPre_id() {
    return this.pre_id;
  }
  public void setPre_id(Long pre_id) {
    this.pre_id = pre_id;
  }
  public Long getSub_id() {
    return this.sub_id;
  }
  public void setSub_id(Long sub_id) {
    this.sub_id = sub_id;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String toString() {
    return super.toString();
    // return BeanString.beanToStr(this);
  }
  public Account getAccount() {
    return this.account;
  }
  public void setAccount(Account account) {
    this.account = account;
  }
  public List<Account> getAccounts() {
    return this.accounts;
  }
  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }
  public String getId() {
    return this.id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public Integer getNum() {
    return this.num;
  }
  public void setNum(Integer num) {
    this.num = num;
  }
}
