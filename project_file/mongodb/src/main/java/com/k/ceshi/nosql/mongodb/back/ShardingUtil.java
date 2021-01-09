package com.k.ceshi.nosql.mongodb.back;

import com.k.ceshi.nosql.mongodb.util.db.DBUtil;
import com.k.ceshi.nosql.mongodb.util.vo.AddressVO;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.Ignore;

@Slf4j
public class ShardingUtil {

  protected MongoClient mc;
  protected DB db;

  @Test
  @Ignore
  public void sharding() throws Exception {
    List<AddressVO> voList = DBUtil.getMongodbShardAloneHost(10);
    DBObject shard = new BasicDBObject();
    AddressVO addr;
    StringBuilder sbprint = new StringBuilder();
    for (int i = 0; i < voList.size(); i++) {
      addr = voList.get(i);
      shard.put("addshard", addr.getHost() + ":" + addr.getPort());
      shard.put("allowLocal", true);
      sbprint.delete(0, sbprint.length());
      sbprint.append("db.runCommand(");
      sbprint.append(shard);
      sbprint.append(");");
      log.info("", sbprint);
    }
  }

  public void sharding_rep() throws Exception {
    List<AddressVO> voList = DBUtil.getMongodbShardRepHost(10);
    DBObject shard = new BasicDBObject();
    AddressVO addr;
    StringBuilder sb = new StringBuilder();
    StringBuilder sbprint = new StringBuilder();
    for (int i = 0; i < voList.size(); i++) {
      addr = voList.get(i);
      shard.put("addshard", addr.getRep() + "/" + addr.getHost() + ":" + addr.getPort());
      shard.put("allowLocal", true);
      sbprint.delete(0, sbprint.length());
      sbprint.append("db.runCommand(");
      sbprint.append(shard);
      sbprint.append(");");
      log.info("", sbprint);
    }
  }

  @Test
  @Ignore
  public void sharding_rep1() throws Exception {
    try {
      List<AddressVO> voList = DBUtil.getMongodbRepHost(45, 10);
      DBObject shard = new BasicDBObject();
      AddressVO addr;
      StringBuilder sb = new StringBuilder();
      StringBuilder sbprint = new StringBuilder();
      for (int i = 0; i < voList.size(); i++) {
        addr = voList.get(i);
        sbprint.append("," + addr.getHost() + ":" + addr.getPort());
      }
      addr = voList.get(0);
      shard.put("addshard", addr.getRepName() + "/" + sbprint.substring(1).toString());
      shard.put("allowLocal", true);
      sb.append("db.runCommand(");
      sb.append(shard.toString());
      sb.append(")");
      log.info("", sb);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Ignore
  public void sharding_enablesharding() throws Exception {
    StringBuilder sbprint = new StringBuilder();
    // 要分片的数据库
    // enablesharding
    DBObject enablesharding = new BasicDBObject();
    enablesharding.put("enablesharding", "test");
    sbprint.delete(0, sbprint.length());
    sbprint.append("db.runCommand(");
    sbprint.append(enablesharding);
    sbprint.append(");");
    log.info("", sbprint);
  }

  @Test
  @Ignore
  public void sharding_shardcollection() throws Exception {
    StringBuilder sbprint = new StringBuilder();
    // 设置要分片的集合:users集合,name字段为key来分片
    // enablesharding
    DBObject shardcollection = new BasicDBObject();
    DBObject key = new BasicDBObject();
    key.put("name", "hashed");
    shardcollection.put("shardcollection", "test.cs");
    shardcollection.put("key", key);
    sbprint.delete(0, sbprint.length());
    sbprint.append("db.runCommand(");
    sbprint.append(shardcollection);
    sbprint.append(");");
    log.info("", sbprint);
  }
}
