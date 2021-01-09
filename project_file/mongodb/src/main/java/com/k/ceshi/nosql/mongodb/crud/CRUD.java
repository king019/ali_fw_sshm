package com.k.ceshi.nosql.mongodb.crud;

import com.k.ceshi.nosql.mongodb.util.jt.JC;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.DBRef;
import com.mongodb.ReadPreference;
import com.mongodb.WriteResult;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.Ignore;

@Slf4j
public class CRUD extends JC {

  @Override
  @Test
  @Ignore
  public void test() {
    try {
      log.debug("bug");
      db = mc.getDB("test");
      db.setReadPreference(ReadPreference.primaryPreferred());
      cs = db.getCollection("cs");
      insert();
      select();
      {
        // ref();
        selectRef();
      }
      // updateEdit();
      // select();
      // delete();
      // select();
    } catch (Exception e) {
      log.error("", e);
    }
  }

  public void insert() {
    DBObject c = new BasicDBObject();
    // DBRef ref=new DBRef(db, ns, id);
    c.put("name", "jack");
    List<DBObject> objs = new ArrayList<DBObject>();
    DBObject v;
    for (int i = 0; i < 5; i++) {
      v = new BasicDBObject();
      v.put("name" + i, "jack" + i);
      v.put("_id", i);
      // v.put("name1", "jack1");
      objs.add(v);
    }
    c.put("_id", 1);
    c.put("objs", objs);
    cs.insert(c);
  }

  public void ref() {
    DBObject c = new BasicDBObject();
    DBRef ref = new DBRef(db.toString(), "cs", 1);
    c.put("name", "jack");
    c.put("ref", ref);
    cs.insert(c);
  }

  public void select() {
    DBObject c = new BasicDBObject();
    c.put("name", "jack");
    DBCursor dc = cs.find(c);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      log.debug("", v);
    }
  }

  public void selectRef() {
    DBObject c = new BasicDBObject();
    c.put("name", "jack");
    DBCursor dc = cs.find(c);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      DBRef ref = (DBRef) v.get("ref");
      if (ref != null) {
        DBObject cref = new BasicDBObject();
        cref.put("_id", ref.getId());
        //cref.put("$ref", ref.getRef());
        c.put("name", "jack");
        //DBObject o1 = DBRef.fetch(db, cref);
        //log.debug(o1);
      }
    }
  }

  public void update() {
    DBObject cc = new BasicDBObject();
    cc.put("name", "jack");
    DBObject cd = new BasicDBObject();
    cd.put("name", "jack");
    cd.put("name1", "jack1");
    WriteResult wr = cs.update(cc, cd);
    log.debug("", wr);
  }

  public void updateEdit() {
    DBObject cc = new BasicDBObject();
    cc.put("name", "jack");
    DBObject cd = new BasicDBObject();
    cd.put("name", "jack");
    cd.put("name1", "jack1");
    WriteResult wr = cs.update(cc, cd);
    log.debug("", wr);
  }

  public void delete() {
    DBObject cc = new BasicDBObject();
    cc.put("name", "jack");
    WriteResult wr = cs.remove(cc);
    log.debug("", wr);
  }
}
