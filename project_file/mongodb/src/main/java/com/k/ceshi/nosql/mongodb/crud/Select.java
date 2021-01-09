package com.k.ceshi.nosql.mongodb.crud;

import com.k.ceshi.nosql.mongodb.util.jt.JC;
import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.GroupCommand;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.Ignore;

@Slf4j
public class Select extends JC {

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
      // cs.remove(new BasicDBObject());
      select_4_3_3_elemMatch();
      // insert(System.currentTimeMillis());
      // insert(2);
      // insert(3);
      show();
      // findShow();
    } catch (Exception e) {
      //   log.error(e);
    }
  }

  public void findShow() {
    select();
  }

  public void insert(Long id) {
    DBObject c = new BasicDBObject();
    // DBRef ref=new DBRef(db, ns, id);
    c.put("name", (char) Math.rint(Math.random() * 125) + "jack");
    // c.put("name1", "jack" + id);
    c.put("age", Math.round(Math.random() * 5));
    // c.put("ageStr", "" + Math.round(Math.random() * 10));
    List<DBObject> objs = new ArrayList<>();
    DBObject v;
    BasicDBList os = new BasicDBList();
    os.add(Math.round(Math.random() * 5));
    os.add(Math.round(Math.random() * 5));
    for (int i = 0; i < 5; i++) {
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
    DBObject v;
    ServerAddress sa = null;
    while (sa == null) {
      sa = mc.getAddress();
      continue;
    }
    // log.debug(dc);
    log.info("showshowshowshowshowshowshowshow");
    while (dc.hasNext()) {
      v = dc.next();
      log.info(v.toString());
    }
    log.info("showshowshowshowshowshowshowshow");
  }

  public void select_find() {
    DBObject c = new BasicDBObject();
    c.put("name", "jack");
    DBCursor dc = cs.find();
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      //  log.info(v);
    }
  }

  public void select_4_2_1_lt() {
    DBObject search = new BasicDBObject();
    DBObject keys = new BasicDBObject();
    // <
    // keys.put("$lt", 5);
    // <=
    // keys.put("$lte", 5);
    // >
    // keys.put("$gt", 4);
    // >=
    // keys.put("$gte", 4);
    // <>
    keys.put("$ne", 4);
    search.put("age", keys);
    DBCursor dc = cs.find(search);
    //log.info(dc);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      //    log.info(v);
    }
  }

  public void select_4_2_2_or() {
    DBObject search = new BasicDBObject();
    BasicDBList orList = new BasicDBList();
    DBObject obj1 = new BasicDBObject();
    obj1.put("age", 1);
    DBObject obj2 = new BasicDBObject();
    obj2.put("age", 2);
    DBObject obj3 = new BasicDBObject();
    obj3.put("age", 3);
    orList.add(obj1);
    orList.add(obj2);
    orList.add(obj3);
    search.put("$or", orList);
    DBCursor dc = cs.find(search);
    //  log.info(dc);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      //   log.info(v);
    }
  }

  public void select_4_2_2_in() {
    DBObject search = new BasicDBObject();
    BasicDBList inList = new BasicDBList();
    inList.add(1);
    inList.add(2);
    inList.add(3);
    DBObject inObj = new BasicDBObject();
    inObj.put("$in", inList);
    search.put("age", inObj);
    DBCursor dc = cs.find(search);
    // log.info(dc);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      //   log.info(v);
    }
  }

  public void select_4_2_3_not() {
    DBObject search = new BasicDBObject();
    DBObject nonObj = new BasicDBObject();
    BasicDBList inList = new BasicDBList();
    inList.add(3);
    inList.add(1);
    DBObject inObj = new BasicDBObject();
    inObj.put("$mod", inList);
    search.put("age", nonObj);
    nonObj.put("$not", inObj);
    DBCursor dc = cs.find(search);
    // log.info(dc);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      //  log.info(v);
    }
  }

  public void select_4_3_1_null() {
    DBObject search = new BasicDBObject();
    DBObject optObj = new BasicDBObject();
    BasicDBList dbList = new BasicDBList();
    dbList.add(null);
    search.put("aa", optObj);
    optObj.put("$in", dbList);
    optObj.put("$exists", true);
    DBCursor dc = cs.find(search);
    // log.info(dc);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      // log.info(v);
    }
  }

  public void select_4_5_1_skip_limit_sort() {
    DBObject c = new BasicDBObject();
    c.put("name", "jack");
    DBObject keys = new BasicDBObject();
    keys.put("name", 1);
    DBObject search = new BasicDBObject();
    search.put("name1", -1);
    DBCursor dc = cs.find(c, keys).limit(2).skip(1).sort(search);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      // log.info(v);
    }
  }

  public void select_4_3_3_all() {
    DBObject search = new BasicDBObject();
    BasicDBList objs = new BasicDBList();
    objs.add("1_0");
    search.put("$all", objs);
    DBObject keys = new BasicDBObject();
    keys.put("objs.n0", search);
    DBCursor dc = cs.find(keys);
    //log.info(dc);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      //   log.info(v);
    }
  }

  public void select_4_3_3_size() {
    DBObject search = new BasicDBObject();
    new BasicDBObject();
    // search.put("objs.n0", "1_0");
    DBObject keys = new BasicDBObject();
    search.put("objs", keys);
    keys.put("$size", 2);
    DBCursor dc = cs.find(search);
    // log.info(dc);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      //  log.info(v);
    }
  }

  public void select_4_3_3_slice() {
    DBObject search = new BasicDBObject();
    DBObject search2 = new BasicDBObject();
    // search.put("objs.n0", "1_0");
    DBObject keys = new BasicDBObject();
    search.put("objs", keys);
    BasicDBList objs = new BasicDBList();
    objs.add(1);
    objs.add(2);
    keys.put("$slice", 1);
    DBCursor dc = cs.find(search2, search);
    // log.info(dc);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      //  log.info(v);
    }
  }

  public void select_4_3_3_elemMatch() {
    DBObject search = new BasicDBObject();
    search.put("objs", 1);
    DBObject search2 = new BasicDBObject();
    // search.put("objs.n0", "1_0");
    DBObject keys = new BasicDBObject();
    DBObject obj = new BasicDBObject();
    obj.put("n0", "1418176381621_0");
    // obj.put("n10", "1_0");
    search.put("objs", keys);
    keys.put("$elemMatch", obj);
    search2.put("objs", keys);
    DBCursor dc = cs.find(search2, search);
    // log.info(dc);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      //  log.info(v);
    }
  }

  public void select_4_4_where() {
    DBObject search = new BasicDBObject();
    search.put("$where", "function(){for(var current in this){for(var other in this){ if( current=='age' && this[current]  == 1)return true;}}}");
    DBCursor dc = cs.find(search);
    //log.info(dc);
    DBObject v;
    while (dc.hasNext()) {
      v = dc.next();
      //   log.info(v);
    }
  }

  public void select_distinct() {
    DBObject search = new BasicDBObject();
    DBObject search2 = new BasicDBObject();
    // search.put("objs.n0", "1_0");
    DBObject keys = new BasicDBObject();
    search.put("objs", keys);
    BasicDBList objs = new BasicDBList();
    objs.add(1);
    objs.add(2);
    keys.put("$slice", 1);
    List list = cs.distinct("name", search2);
    // log.info(list);
  }

  public void select_count() {
    DBObject search = new BasicDBObject();
    DBObject search2 = new BasicDBObject();
    // search.put("objs.n0", "1_0");
    DBObject keys = new BasicDBObject();
    search.put("objs", keys);
    BasicDBList objs = new BasicDBList();
    objs.add(1);
    objs.add(2);
    keys.put("$slice", 1);
    Long lg = cs.count(search2);
    //log.info(lg);
  }

  public void select_group_error() {
    DBObject initial = new BasicDBObject();
    initial.put("age", 0);
    initial.put("name", "");
    initial.put("ageStr", "");
    BasicDBList keys = new BasicDBList();
    keys.add("ageStr");
    keys.add("name");
    // DBObject keys = new BasicDBList();
    // keys.put("key", "age");
    GroupCommand command = new GroupCommand(cs, keys, null, initial, "function(doc,pre){pre.age=pre.age+doc.age;pre.name=doc.name;pre.ageStr=doc.ageStr;}", null);
    // log.info(command);
    DBObject v = cs.group(command);
    /// log.info(v);
  }

  public void select_aggreate() {
    DBObject match = new BasicDBObject();
    DBObject match_sub = new BasicDBObject();
    match.put("$match", match_sub);
    match_sub.put("name", "jack");
    DBObject group = new BasicDBObject();
    DBObject group_sub = new BasicDBObject();
    DBObject group_pre = new BasicDBObject();
    List pipeline = new BasicDBList();
    group.put("_id", "$age");
    group.put("total", group_sub);
    group_sub.put("$sum", "$age");
    group_pre.put("$group", group);
    pipeline.add(match);
    pipeline.add(group_pre);
    // log.info(pipeline);
    AggregationOutput aot = cs.aggregate(pipeline);
    Iterable<DBObject> ites = aot.results();
    Iterator<DBObject> dbos = ites.iterator();
    DBObject vo;
    while (dbos.hasNext()) {
      vo = dbos.next();
      //log.info(vo);
    }
  }

  public void select() {
    DBObject match = new BasicDBObject();
    DBObject match_sub = new BasicDBObject();
    match.put("$match", match_sub);
    match_sub.put("name", "jack");
    DBObject group = new BasicDBObject();
    DBObject group_sub = new BasicDBObject();
    DBObject group_pre = new BasicDBObject();
    List pipeline = new BasicDBList();
    group.put("_id", "$name");
    group.put("total", group_sub);
    group_sub.put("$sum", "$age");
    group_pre.put("$group", group);
    pipeline.add(match);
    pipeline.add(group_pre);
    //log.info(pipeline);
    AggregationOutput aot = cs.aggregate(pipeline);
    Iterable<DBObject> ites = aot.results();
    Iterator<DBObject> dbos = ites.iterator();
    DBObject vo;
    while (dbos.hasNext()) {
      vo = dbos.next();
      //log.info(vo);
    }
  }
}
