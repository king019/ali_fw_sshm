package com.k.ceshi.nosql.mongodb.ensureindex;
import com.k.ceshi.nosql.mongodb.util.jt.JC;
import com.mongodb.BasicDBObject;
import com.mongodb.ReadPreference;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBIndex extends JC {
  @Override
  public void test() {
    try {
      db = mc.getDB("test");
      db.dropDatabase();
      db = mc.getDB("test");
      db.setReadPreference(ReadPreference.secondaryPreferred());
      cs = db.getCollection("cs");
      BasicDBObject index = new BasicDBObject();
      index.put("name", 1);
      cs.createIndex(index);
    } catch (Exception e) {
      log.error("",e);
    }
  }
}
