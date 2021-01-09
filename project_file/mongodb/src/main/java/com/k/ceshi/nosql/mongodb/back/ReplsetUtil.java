package com.k.ceshi.nosql.mongodb.back;

import com.k.ceshi.nosql.mongodb.util.db.DBUtil;
import com.k.ceshi.nosql.mongodb.util.vo.AddressVO;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.Ignore;

@Slf4j
public class ReplsetUtil {

  protected MongoClient mc;
  protected DB db;

  @Test
  @Ignore
  public void test() throws Exception {
    replset(62, 10);
    // for (int i = 0; i < 10; i++) {
    // replset(46, 10);
    // }
  }

  public void replset(int sort, int num) throws Exception {
    List<AddressVO> voList = DBUtil.getMongodbRepHost(sort, num);
    if (voList.size() == 0) {
      return;
    }
    AddressVO v_0 = voList.get(0);
    DBObject dbCmd = new BasicDBObject();
    dbCmd.put("_id", v_0.getRepName());
    DBObject dbHost;
    List<DBObject> members = new ArrayList<DBObject>();
    AddressVO v1;
    for (int i = 0; i < voList.size(); i++) {
      v1 = voList.get(i);
      new ServerAddress(v1.getHost(), v1.getPort());
      dbHost = new BasicDBObject();
      dbHost.put("_id", i);
      dbHost.put("host", v1.getHost() + ":" + v1.getPort());
      // dbHost.put("priority", v1.getPriority());
      members.add(dbHost);
    }
    dbCmd.put("members", members);
    DBObject dbCmdOut = new BasicDBObject();
    dbCmdOut.put("replSetInitiate", dbCmd);
    StringBuilder sb = new StringBuilder();
    sb.append(" db.runCommand(");
    sb.append(dbCmdOut);
    sb.append(")");
    log.debug("", sb);
    // db.command(dbCmd);
  }
}
