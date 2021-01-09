package com.k.ceshi.nosql.mongodb.util.jt;

import com.k.ceshi.nosql.mongodb.util.db.DBUtil;
import com.k.ceshi.nosql.mongodb.util.vo.AddressVO;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.gridfs.GridFS;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.junit.Ignore;

@Slf4j
public abstract class JC {

  protected MongoClient mc;
  protected DB db;
  protected DBCollection cs;
  protected GridFS myfs;

  @Before
  public void setUp() throws Exception {
    List<ServerAddress> list = new ArrayList<ServerAddress>();
    List<AddressVO> voList = DBUtil.getMongodbCRUDHost(10);
    ServerAddress vo;
    for (AddressVO v : voList) {
      log.debug(v.getHost() + ":" + v.getPort());
      vo = new ServerAddress(v.getHost(), v.getPort());
      list.add(vo);
    }
    mc = new MongoClient(list);
    // log.debug(mc);
  }

  @Test
  @Ignore
  public abstract void test();

  @After
  public void tearDown() throws Exception {
    mc.close();
    mc = null;
  }
}
