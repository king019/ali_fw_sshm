package com.k.ceshi;

import com.k.mongo.vo.Account;
import com.k.mongo.vo.Persion;
import com.k.util.jc.JC;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.Ignore;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class Find extends JC {

  private Persion persion;
  private List<Persion> list;

  @Override
  @Test
  @Ignore
  public void test() {
    try {
      insert();
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
      p.setAccount(account);
      List<Account> list = new ArrayList<>();
      for (int j = 0; j < 3; j++) {
        Account a2 = new Account();
        a2.setId("a2id" + i);
        a2.setName("a2name" + i);
        list.add(a2);
      }
      p.setAccounts(list);
      mongoTemplate.insert(p);
    }
  }

  public void select() {
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
    list = mongoTemplate.find(query, Persion.class);
    for (Persion vo : list) {
      System.out.println(vo);
    }
  }
}
