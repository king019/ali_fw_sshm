package com.k.ceshi;

import com.k.mongo.vo.Account;
import com.k.mongo.vo.Persion;
import com.k.util.jc.JC;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.Ignore;
import org.springframework.data.mongodb.core.mapreduce.GroupBy;
import org.springframework.data.mongodb.core.mapreduce.GroupByResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public class Aggregate extends JC {

  private Persion persion;
  private List<Persion> list;

  @Override
  @Test
  @Ignore
  public void test() {
    try {
      select();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void insert() {
    for (int i = 0; i < 5; i++) {
      Account account = new Account();
      account.setId("aid" + i);
      account.setName("aname" + i);
      Persion p = new Persion();
      p.setId("id" + i);
      p.setName("name" + i);
      p.setNum(i);
      p.setAccount(account);
      List<Account> list = new ArrayList<>();
      for (int j = 0; j < 3; j++) {
        Account a2 = new Account();
        a2.setId("a2id" + i);
        a2.setNum(i);
        a2.setName("a2name" + i);
        list.add(a2);
      }
      p.setAccounts(list);
      mongoTemplate.insert(p);
    }
  }

  public void select() {
    Criteria criteria = new Criteria("name");
    {
      criteria.is("name0");
    }
    Query query = new Query(criteria);
    Update update = new Update();
    update.set("name", "updateFirst1111");
    GroupBy groupBy = new GroupBy("name");
    groupBy.keyFunction("keyfunc");
    groupBy.initialDocument("{'num':0}");
    groupBy.reduceFunction("function(doc,pre){pre.num=pre.num+doc.num;}");
    groupBy.finalizeFunction("function(pre){pre.num=pre.num+1000;}");
    GroupByResults<Persion> wr = mongoTemplate.group("cs", groupBy, Persion.class);
    System.out.println(wr);
  }

  public void upsert() {
    Criteria criteria = new Criteria("name");
    {
      criteria.is("name0");
    }
    Query query = new Query(criteria);
    Update update = new Update();
    update.set("name", "updateFirst1111");
    mongoTemplate.upsert(query, update, Persion.class);
  }

  public void count() {
    persion = new Persion();
    persion.setName("insert_" + new Date());
    Criteria criteria = new Criteria("accounts");
    {
      criteria.exists(true);
    }
    {
      // criteria.elemMatch(new Criteria("name").in(("a2name0")));
    }
    {
      criteria.and("accounts.0.name").is("a2name0");
    }
    Query query = new Query(criteria);
    System.out.println(query);
    System.out.println(mongoTemplate.count(query, Persion.class));
    list = mongoTemplate.find(query, Persion.class);
    for (Persion vo : list) {
      System.out.println(vo);
    }
  }
}
