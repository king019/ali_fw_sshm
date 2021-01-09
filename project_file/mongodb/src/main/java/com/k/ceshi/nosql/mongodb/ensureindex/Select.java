package com.k.ceshi.nosql.mongodb.ensureindex;

import com.k.ceshi.nosql.mongodb.util.jt.JCAuth;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.Ignore;

@Slf4j
public class Select extends JCAuth {

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
      insert(System.currentTimeMillis());
      // insert(2);
      // insert(3);
      Thread.sleep(1000);
      show();
    } catch (Exception e) {
      log.error("", e);
    }
  }

  public void insert(Long id) {
    DBObject c = new BasicDBObject();
    // DBRef ref=new DBRef(db, ns, id);
    c.put("name", "jack");
    // c.put("name1", "jack" + id);
    c.put("age", Math.round(Math.random() * 5));
    // c.put("ageStr", "" + Math.round(Math.random() * 10));
    List<DBObject> objs = new ArrayList<DBObject>();
    DBObject v;
    BasicDBList os = new BasicDBList();
    os.add(Math.round(Math.random() * 5));
    os.add(Math.round(Math.random() * 5));
    for (int i = 0; i < 2; i++) {
      v = new BasicDBObject();
      v.put("n" + i, id + "_" + i);
      v.put("n1" + i, id + "_" + i);
      v.put("nar", os);
      v.put("rdm", Math.round(Math.random() * 100));
      objs.add(v);
    }
    c.put("nar", os);
    c.put("_id", id);
    ServerAddress sa = mc.getAddress();
    String hostPort;
    while (sa == null) {
      sa = mc.getAddress();
      continue;
    }
    hostPort = sa.toString();
    c.put("host", hostPort);
    // c.put("_id", id);
    // c.put("inc", 1);
    c.put("objs", objs);
    cs.insert(c);
  }

  public void show() {
    DBCursor dc = cs.find();
    DBObject dbobj = cs.find().explain();
    DBObject v;
    ServerAddress sa = null;
    while (sa == null) {
      sa = mc.getAddress();
      continue;
    }
    log.info("showshowshowshowshowshowshowshow");
    while (dc.hasNext()) {
      v = dc.next();
      log.debug("", v);
    }
    log.info("showshowshowshowshowshowshowshow");
  }
}
