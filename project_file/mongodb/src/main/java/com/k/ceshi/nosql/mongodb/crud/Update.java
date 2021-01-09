package com.k.ceshi.nosql.mongodb.crud;

import com.k.ceshi.nosql.mongodb.util.jt.JC;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.Ignore;

@Slf4j
public class Update extends JC {

  @Override
  @Test
  @Ignore
  public void test() {
    try {
      db = mc.getDB("test");
      db.dropDatabase();
      db = mc.getDB("test");
      cs = db.getCollection("cs");
      insert();
      select();
      updateEditPush();
      select();
      // updateEditSet();
      // select();
      // updateEditUnSet();
      // select();
    } catch (Exception e) {
      // log.error(e);
    }
  }

  public void insert() {
    DBObject c = new BasicDBObject();
    // DBRef ref=new DBRef(db, ns, id);
    c.put("name", "jack");
    List<DBObject> objs = new ArrayList<DBObject>();
    DBObject v;
    for (int i = 0; i < 2; i++) {
      v = new BasicDBObject();
      v.put("name" + i, "jack" + i);
      v.put("_id", i);
      // v.put("name1", "jack1");
      objs.add(v);
    }
    c.put("_id", 1);
    c.put("inc", 1);
    c.put("objs", objs);
    cs.insert(c);
  }

  public void updateEditSet() {
    DBObject cc = new BasicDBObject();
    {
      cc.put("name", "jack");
    }
    DBObject cd = new BasicDBObject();
    DBObject cdEdt = new BasicDBObject();
    {
      cdEdt.put("name2", "jack2");
    }
    DBObject cdEdt2 = new BasicDBObject();
    {
      cdEdt2.put("inc1", -4);
    }
    {
      // cd.put("name", "jack");
      cd.put("$set", cdEdt);
      cd.put("$inc", cdEdt2);
    }
    WriteResult wr = cs.update(cc, cd);
    // log.error(wr);
  }

  public void updateEditUnSet() {
    DBObject cc = new BasicDBObject();
    {
      cc.put("name", "jack");
    }
    DBObject cd = new BasicDBObject();
    DBObject cdEdt = new BasicDBObject();
    {
      cdEdt.put("name2", "jack2");
    }
    DBObject cdEdt2 = new BasicDBObject();
    {
      cdEdt2.put("inc1", 4);
    }
    {
      // cd.put("name", "jack");
      cd.put("$unset", cdEdt);
      cd.put("$inc", cdEdt2);
    }
    WriteResult wr = cs.update(cc, cd);
    // log.error(wr);
  }

  public void updateEditPush() {
    DBObject cc = new BasicDBObject();
    {
      cc.put("name", "jack");
    }
    DBObject cd = new BasicDBObject();
    DBObject cdEdt = new BasicDBObject();
    {
      cdEdt.put("objs", "jack2objs");
    }
    DBObject cdEdt2 = new BasicDBObject();
    {
      cdEdt2.put("inc1", 4);
    }
    {
      cd.put("$push", cdEdt);
    }
    WriteResult wr = cs.update(cc, cd);
    //log.error(wr);
  }

  public void select() {
    DBObject c = new BasicDBObject();
    c.put("name", "jack");
    DBCursor dc = cs.find(c);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      //   log.error(v);
    }
  }
}
