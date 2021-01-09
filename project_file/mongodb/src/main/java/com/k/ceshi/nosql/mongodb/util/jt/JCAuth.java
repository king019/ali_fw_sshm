package com.k.ceshi.nosql.mongodb.util.jt;

import com.k.ceshi.nosql.mongodb.util.db.DBUtil;
import com.k.ceshi.nosql.mongodb.util.vo.AddressVO;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

@Slf4j
public abstract class JCAuth {

  protected MongoClient mc;
  protected DB db;
  protected DBCollection cs;

  @Before
  public void setUp() throws Exception {
    log.info("mongodb开启");
    List<ServerAddress> list = new ArrayList<>();
    List<AddressVO> voList = DBUtil.getMongodbCRUDHost(10);
    ServerAddress vo;
    for (AddressVO v : voList) {
      vo = new ServerAddress(v.getHost(), v.getPort());
      list.add(vo);
    }
    List<MongoCredential> ahths = DBUtil.getMongodbAuth(10);
    mc = new MongoClient(list, ahths);
  }

  @Test
  @Ignore
  public abstract void test();

  @After
  public void tearDown() throws Exception {
    mc.close();
    log.info("mongodb关闭");
  }
}
