package com.k.ceshi.nosql.mongodb.crud;

import com.k.ceshi.nosql.mongodb.util.jt.JCAuth;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.DBRef;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;
import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.Ignore;

@Slf4j
public class Select_reference extends JCAuth {

  @Override
  @Test
  @Ignore
  public void test() {
    try {
      // db = mc.getDB("test");
      // db.dropDatabase();
      db = mc.getDB("test");
      db.setReadPreference(ReadPreference.secondaryPreferred());
      cs = db.getCollection("cs");
      insert("2");
      insert("1");
      // insert(3);
      Thread.sleep(1000);
      select_find();
      show();
    } catch (Exception e) {
      System.out.println(e);
      //   log.error(e);
    }
  }

  public void insert(String id) {
    DBObject c = new BasicDBObject();
    DBRef ref = new DBRef(db.toString(), "cs", "1");
    c.put("_id", id);
    c.put("name", "jack");
    c.put("ref", ref);
    cs.save(c);
    // cs.insert(c);
  }

  public void show() {
    DBCursor dc = cs.find();
    // log.info(dc);
    // log.info(dc);
    DBObject v;
    ServerAddress sa = null;
    while (sa == null) {
      sa = mc.getAddress();
      continue;
    }
    //log.info(dc);
    log.info("showshowshowshowshowshowshowshow");
    while (dc.hasNext()) {
      v = dc.next();
      //  log.info(v);
    }
    log.info("showshowshowshowshowshowshowshow");
  }

  public void select_find() {
    DBObject c = new BasicDBObject();
    c.put("_id", "2");
    DBObject dc = cs.findOne(c);
    // log.info(dc);
    DBRef ref = (DBRef) dc.get("ref");
    // log.info(ref);
  }
}
