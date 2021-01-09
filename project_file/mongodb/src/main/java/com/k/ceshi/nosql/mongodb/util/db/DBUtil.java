package com.k.ceshi.nosql.mongodb.util.db;

import com.k.ceshi.nosql.mongodb.util.vo.AddressVO;
import com.mongodb.MongoCredential;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.junit.Test;
import org.junit.Ignore;

public class DBUtil {

  public static List<AddressVO> getMongodbCRUDHost(int num) {
    return getMongodbHost("db.properties", "mongodb", num);
  }

  public static List<AddressVO> getMongodbRepHost(int sort, int num) {
    return getMongodbHost("rep\\rep" + sort + ".properties", "mongodbRep", num);
  }

  public static List<AddressVO> getMongodbShardAloneHost(int num) {
    return getMongodbHost("shard.properties", "mongodb", num);
  }

  public static List<AddressVO> getMongodbShardRepHost(int num) {
    return getMongodbHost("shard_rep.properties", "mongodb", num);
  }

  public static List<AddressVO> getMongodbAuthHost_nouse(int num) {
    return getMongodbHost("auth.properties", "mongodbAuth", num);
  }

  public static List<AddressVO> getMongodbShutdownHost(int num) {
    return getMongodbHost("shutdown.properties", "mongodb", num);
  }

  public static List<MongoCredential> getMongodbAuth(int num) {
    return getMongodbAuth("auth.properties", "mongodbAuth", num);
  }

  public static List<AddressVO> getMongodbHost(String proName, String pre, int num) {
    List<AddressVO> list = new ArrayList<>();
    try {
      String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
      File file = new File(path + proName);
      if (!file.exists()) {
        return list;
      }
      InputStream is;
      is = new FileInputStream(file);
      Properties ps = new Properties();
      ps.load(is);
      String host = pre + ".host";
      String port = pre + ".port";
      String priority = pre + ".priority";
      String rep = pre + ".rep";
      String repName = pre + ".repName";
      StringBuilder sb = new StringBuilder();
      AddressVO vo;
      for (int i = 0; i < num; i++) {
        sb.delete(0, sb.length());
        if (ps.getProperty(host + i) == null) {
          continue;
        }
        sb.append(ps.getProperty(host + i));
        vo = new AddressVO();
        vo.setHost(sb.toString());
        sb.delete(0, sb.length());
        sb.append(ps.getProperty(port + i, ps.getProperty(port)));
        vo.setPort(Integer.parseInt(sb.toString()));
        if (ps.getProperty(priority + i, ps.getProperty(priority)) != null) {
          sb.delete(0, sb.length());
          sb.append(ps.getProperty(priority + i, ps.getProperty(priority)));
          vo.setPriority(Integer.parseInt(sb.toString()));
        }
        if (ps.getProperty(rep + i, ps.getProperty(rep)) != null) {
          sb.delete(0, sb.length());
          sb.append(ps.getProperty(rep + i, ps.getProperty(rep)));
          vo.setRep(sb.toString());
        }
        if (ps.getProperty(repName + i, ps.getProperty(repName)) != null) {
          sb.delete(0, sb.length());
          sb.append(ps.getProperty(repName + i, ps.getProperty(repName)));
          vo.setRepName(sb.toString());
        }
        list.add(vo);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return list;
  }

  public static List<MongoCredential> getMongodbAuth(String proName, String pre, int num) {
    List<MongoCredential> list = new ArrayList<>();
    try {
      String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
      File file = new File(path + proName);
      InputStream is;
      is = new FileInputStream(file);
      Properties ps = new Properties();
      ps.load(is);
      String db = pre + ".db";
      String user = pre + ".user";
      String pwd = pre + ".pwd";
      StringBuilder sb = new StringBuilder();
      MongoCredential vo;
      StringBuilder dbsb = new StringBuilder();
      StringBuilder usersb = new StringBuilder();
      StringBuilder pwdsb = new StringBuilder();
      for (int i = 0; i < num; i++) {
        sb.delete(0, sb.length());
        if (ps.getProperty(db + i) == null) {
          continue;
        }
        dbsb.append(ps.getProperty(db + i));
        usersb.append(ps.getProperty(user + i));
        pwdsb.append(ps.getProperty(pwd + i));
        vo = MongoCredential.createMongoCRCredential(usersb.toString(), dbsb.toString(), pwdsb.toString().toCharArray());
        list.add(vo);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return list;
  }

  @Test
  @Ignore
  public void test() {
    getMongodbCRUDHost(12);
  }
}
