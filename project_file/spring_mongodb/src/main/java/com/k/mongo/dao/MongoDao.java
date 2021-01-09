package com.k.mongo.dao;
import com.k.mongo.vo.Persion;
public interface MongoDao {
  public void insert(Persion persion);
  public void update(Persion persion);
  public void delete(Persion persion);
  public void find(Persion persion);
  public void test();
}
