package com.k.ceshi.nosql.mongodb.crud;

import com.k.ceshi.nosql.mongodb.util.jt.JCAuth;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;
import com.mongodb.WriteResult;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.Ignore;

@Slf4j
public class Select_date_number extends JCAuth {

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
      find();
    } catch (Exception e) {
      log.error("", e);
    }
  }

  public void insert(Long id) {
    DBObject c = new BasicDBObject();
    c.put("name", "jack");
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.SECOND, 39);
    Date date = new Date(calendar.getTimeInMillis());
    c.put("date", date);
    c.put("num", 1234567890123456789l);
    c.put("num", 123456);
    new ArrayList<DBObject>();
    c.put("_id", id);
    ServerAddress sa = mc.getAddress();
    String hostPort;
    while (sa == null) {
      sa = mc.getAddress();
      continue;
    }
    hostPort = sa.toString();
    c.put("host", hostPort);
    WriteResult wr = cs.insert(c, WriteConcern.UNACKNOWLEDGED);
    log.info("", wr);
    log.info("ok:" + wr.getN());
  }

  public void show() {
    DBCursor dc = cs.find();
    log.info("", dc);
    DBObject v;
    ServerAddress sa = null;
    while (sa == null) {
      sa = mc.getAddress();
      continue;
    }
    log.info("showshowshowshowshowshowshowshow");
    while (dc.hasNext()) {
      v = dc.next();
      log.info("", v);
    }
    log.info("showshowshowshowshowshowshowshow");
  }

  public void find() {
    DBObject search = new BasicDBObject();
    DBObject key = new BasicDBObject();
    key.put("$gt", new Date());
    search.put("date", key);
    DBCursor dc = cs.find(search);
    log.info("", dc);
    DBObject v;
    ServerAddress sa = null;
    while (sa == null) {
      sa = mc.getAddress();
      continue;
    }
    log.info("sa:" + sa.toString());
    log.info("showshowshowshowshowshowshowshow");
    while (dc.hasNext()) {
      v = dc.next();
      log.info("", v);
    }
    log.info("showshowshowshowshowshowshowshow");
  }

  public void find_test() {
  }
}
