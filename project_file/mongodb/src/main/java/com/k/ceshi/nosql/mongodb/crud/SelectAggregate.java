package com.k.ceshi.nosql.mongodb.crud;

import com.k.ceshi.nosql.mongodb.util.jt.JCAuth;
import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MapReduceCommand;
import com.mongodb.MapReduceCommand.OutputType;
import com.mongodb.MapReduceOutput;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.Ignore;

@Slf4j
public class SelectAggregate extends JCAuth {

  DBCollection csout;

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
      csout = db.getCollection("csout");
      csout.remove(new BasicDBObject());
      insert(System.currentTimeMillis());
      // insert(2);
      // insert(3);
      // Thread.sleep(1000);
      show();
      findShow();
    } catch (Exception e) {
      //log.error(e);
    }
  }

  public void findShow() {
    select();
  }

  public void insert(Long id) {
    DBObject c = new BasicDBObject();
    // DBRef ref=new DBRef(db, ns, id);
    c.put("name", id + "jack");
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
    // c.put("objs", objs);
    cs.insert(c);
  }

  public void show(DBCollection dbc) {
    DBCursor dc = dbc.find();
    DBObject v;
    log.info("dbcshowshow");
    while (dc.hasNext()) {
      v = dc.next();
      // log.info(v);
    }
    log.info("dbcshowshow");
  }

  public void show() {
    DBCursor dc = cs.find();
    DBObject v;
    ServerAddress sa = null;
    while (sa == null) {
      sa = mc.getAddress();
      continue;
    }
    log.info("showshowshowshowshowshowshowshow");
    while (dc.hasNext()) {
      v = dc.next();
      // log.info(v);
    }
    log.info("showshowshowshowshowshowshowshow");
  }

  public void select_aggregate() {
    // $match
    // $sort
    // $geoNear
    // $match, $limit, and $skip
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

  public void select_map_reduce() {
    // 查看结果
    String map = "function(){emit(this.name,this.age)}";
    String reduce = "function(key,vals){return Array.sum(vals)}";
    String outputCollection = "csout";
    OutputType type = OutputType.INLINE;
    DBObject query = new BasicDBObject();
    MapReduceCommand mc = new MapReduceCommand(cs, map, reduce, outputCollection, type, query);
    MapReduceOutput mco = cs.mapReduce(mc);
    Iterable<DBObject> itable = mco.results();
    Iterator<DBObject> it = itable.iterator();
    while (it.hasNext()) {
      //log.info(it.next());
    }
    csout = mco.getOutputCollection();
    // csout = db.getCollection("csout");
    // show(csout);
    //log.info(mco);
  }

  public void select() {
    String map = "function(){emit(this.name,this.age)}";
    String reduce = "function(key,vals){return Array.sum(vals)}";
    String outputCollection = "csout";
    OutputType type = OutputType.INLINE;
    DBObject query = new BasicDBObject();
    MapReduceCommand mc = new MapReduceCommand(cs, map, reduce, outputCollection, type, query);
    MapReduceOutput mco = cs.mapReduce(mc);
    Iterable<DBObject> itable = mco.results();
    Iterator<DBObject> it = itable.iterator();
    while (it.hasNext()) {
      //log.info(it.next());
    }
    csout = mco.getOutputCollection();
    // csout = db.getCollection("csout");
    // show(csout);
    // log.info(mco);
  }
}
