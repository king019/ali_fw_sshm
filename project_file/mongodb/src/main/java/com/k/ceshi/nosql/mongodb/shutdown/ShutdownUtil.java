package com.k.ceshi.nosql.mongodb.shutdown;

import com.k.ceshi.nosql.mongodb.util.db.DBUtil;
import com.k.ceshi.nosql.mongodb.util.vo.AddressVO;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.Ignore;

@Slf4j
public class ShutdownUtil {

  protected MongoClient mc;
  protected DB db;

  @Test
  @Ignore
  public void test() throws Exception {
    List<AddressVO> vs = DBUtil.getMongodbShutdownHost(10);
    for (AddressVO vo : vs) {
      shutdown(vo.getHost(), vo.getPort());
    }
  }

  public void shutdown(String host, int port) throws Exception {
    try {
      // String host = "192.168.2.48";
      // int port = 27019;
      String dbName = "admin";
      String user = "admin";
      String pwd = "admin";
      List<MongoCredential> ahths = new ArrayList<MongoCredential>();
      MongoCredential admin = MongoCredential.createMongoCRCredential(user, dbName, pwd.toCharArray());
      ServerAddress vo = new ServerAddress(host, port);
      ahths.add(admin);
      mc = new MongoClient(vo, ahths);
      db = mc.getDB(dbName);
      DBObject cmd = new BasicDBObject();
      cmd.put("shutdown", 1);
      // cmd.put("force ", true);
      // log.info(cmd);
      // log.debug(db.command(cmd));
    } catch (Exception e) {
      //log.error(e);
    }
  }
}
