package com.k.ceshi.nosql.mongodb.model;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;

import org.junit.Test;
import org.junit.Ignore;

public class MongoModel {

  @Test
  @Ignore
  public void test() {
    for (int i = 0; i < 3; i++) {
      persion();
    }
  }

  public void persion() {
    BasicDBObject addr;
    BasicDBList addrs = new BasicDBList();
    for (int i = 0; i < 5; i++) {
      addr = new BasicDBObject();
      addr.put("zip", "zip" + mh());
      addrs.add(addr);
    }
    BasicDBObject obj = new BasicDBObject();
    obj.put("userid", mh());
    obj.put("addrs", addrs);
    System.out.println(obj);
  }

  public void son() {
  }

  public long mh() {
    return Math.round(Math.random() * 10);
  }
}
