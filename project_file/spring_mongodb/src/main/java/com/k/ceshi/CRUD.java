package com.k.ceshi;

import com.k.mongo.vo.Persion;
import com.k.util.jc.JC;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.Ignore;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public class CRUD extends JC {

  private Persion persion;
  private List<Persion> list;

  @Override
  @Test
  @Ignore
  public void test() {
    try {
      // insert();
      update();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void select() {
    persion = new Persion();
    persion.setName("insert_" + new Date());
    Criteria criteria = new Criteria("name");
    criteria.exists(true);
    criteria.and("id");
    criteria.exists(true);
    Query query = new Query(criteria);
    System.out.println(query);
    list = mongoTemplate.find(query, Persion.class);
    for (Persion vo : list) {
      System.out.println(vo);
    }
  }

  public void insert() {
    persion = new Persion();
    persion.setName("insert_" + new Date());
    mongoTemplate.insert(persion);
  }

  public void insertlist() {
    list = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      persion = new Persion();
      persion.setName("insertlist_" + new Date());
      list.add(persion);
    }
    mongoTemplate.insert(list, Persion.class);
  }

  public void update() {
    Criteria criteria = new Criteria("name");
    criteria.exists(true);
    Query query = new Query(criteria);
    Update update = new Update();
    // update.pop("updateTest", Update.Position.FIRST);
    update.pull("updateTest", "a");
    // update.push("updateTest", "push");
    // update.addToSet("updateTest", "e");
    System.out.println(query);
    System.out.println(update);
    UpdateResult wr = mongoTemplate.updateFirst(query, update, Persion.class);
    System.out.println(wr);
  }

  public void update1() {
    Criteria c = new Criteria();
    c.and("id").is("53b4193eeabcc23547cf3974");
    c.and("accounts.name").is("name_794017");
    Query query = new Query(c);
    Persion p = mongoTemplate.findOne(query, Persion.class);
    Update update = new Update();
    update.set("accounts.$.name", "newname");
    System.out.println(update.getUpdateObject());
    mongoTemplate.updateFirst(query, update, Persion.class);
    System.out.println(p);
  }

  public void remove() {
    Query query = new Query();
    DeleteResult wr = mongoTemplate.remove(query, Persion.class);
    System.out.println(wr);
  }
}
