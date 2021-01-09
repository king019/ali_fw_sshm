package com.k.ceshi.test;
import com.k.mongo.vo.Persion;
import com.k.util.jc.JC;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
public class CopyOfCeShi extends JC {
  @Override
  public void test() {
    try {
      Criteria c = new Criteria();
      c.and("id").is("53b4193eeabcc23547cf3974");
      c.and("accounts.name").is("name_794017");
      Query query = new Query(c);
      Persion p = this.mongoTemplate.findOne(query, Persion.class);
      Update update = new Update();
      update.set("accounts.$.name", "newname");
      System.out.println(update.getUpdateObject());
      this.mongoTemplate.updateFirst(query, update, Persion.class);
      System.out.println(p);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
