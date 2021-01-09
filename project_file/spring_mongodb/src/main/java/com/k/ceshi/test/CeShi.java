package com.k.ceshi.test;
import com.k.mongo.vo.Account;
import com.k.mongo.vo.Persion;
import com.k.util.jc.JC;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;
public class CeShi extends JC {
  @Override
  public void test() {
    try {
      this.mongoDao.delete(null);
      for (int i = 0; i < 10; i++) {
        this.insert();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public void insert() {
    Persion p = new Persion();
    long id = Math.round(Math.random() * 1000000);
    // p.setId(id);
    p.setName("id" + id);
    // p.setPersion(p);
    Account ac = new Account();
    ac.setId(new ObjectId().toHexString());
    ac.setName("name_" + id);
    p.setAccount(ac);
    List<Account> list = new ArrayList<Account>();
    for (int i = 0; i < 3; i++) {
      ac = new Account();
      ac.setId(new ObjectId().toHexString());
      ac.setName("name_" + id);
      list.add(ac);
    }
    p.setAccounts(list);
    this.mongoDao.insert(p);
  }
  public void update() {
    Persion p = new Persion();
    p.setName("123456");
    this.mongoDao.update(p);
  }
  public void delete() {
    Persion p = new Persion();
    p.setName("123456");
    this.mongoDao.delete(p);
  }
  public void testjava() {
    this.mongoDao.test();
  }
  public void find() {
    Persion p = new Persion();
    // p.setName("name_ins_" + System.currentTimeMillis());
    this.mongoDao.find(p);
  }
  public void show() {
    DBCursor dc = this.cs.find();
    DBObject v;
    ServerAddress sa = null;
    while (sa == null) {
      sa = this.mc.getAddress();
      continue;
    }
    this.log.info("showshowshowshowshowshowshowshow");
    while (dc.hasNext()) {
      v = dc.next();
      this.log.info(v.toString());
    }
    this.log.info("showshowshowshowshowshowshowshow");
  }
  public void insert(Long id) {
    DBObject c = new BasicDBObject();
    // DBRef ref=new DBRef(db, ns, id);
    c.put("name", (char) Math.rint(Math.random() * 125) + "jack");
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
    ServerAddress sa = this.mc.getAddress();
    String hostPort;
    while (sa == null) {
      sa = this.mc.getAddress();
      continue;
    }
    hostPort = sa.toString();
    c.put("host", hostPort);
    // c.put("_id", id);
    // c.put("inc", 1);
    c.put("objs", objs);
    this.cs.insert(c);
  }
}
