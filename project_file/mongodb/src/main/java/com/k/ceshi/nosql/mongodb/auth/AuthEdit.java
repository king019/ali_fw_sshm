package com.k.ceshi.nosql.mongodb.auth;

import com.k.ceshi.nosql.mongodb.util.db.DBUtil;
import com.k.ceshi.nosql.mongodb.util.jt.JC;
import com.k.ceshi.nosql.mongodb.util.vo.AddressVO;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.Ignore;

@Slf4j
public class AuthEdit extends JC {

  // @Test @Ignore
  @Override
  public void test() {
    mc.getDB("admin");
  }

  @Test
  @Ignore
  public void addUser() throws Exception {
    try {
      List<AddressVO> voList = DBUtil.getMongodbAuthHost_nouse(10);
      ServerAddress vo;
      for (AddressVO v : voList) {
        try {
          vo = new ServerAddress(v.getHost(), v.getPort());
          mc = new MongoClient(vo);
          db = mc.getDB("admin");
          db.setReadPreference(ReadPreference.secondary());
          DBCollection c = db.getCollection("system.users");
          DBObject o = c.findOne(new BasicDBObject("user", "admin"));
          if (o == null) {
            o = new BasicDBObject("user", "admin");
          }
          o.put("pwd", "admin");
          o.put("readOnly", false);
          log.debug("", c.save(o));
        } catch (Exception e) {
          log.error("", e);
        }
      }
    } catch (Exception e) {
      log.error("", e);
    }
  }
}
