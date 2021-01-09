package com.k.mongo.dao.impl;
import com.k.mongo.dao.MongoDao;
import com.k.mongo.vo.Persion;
import com.k.util.jc.log.LogUtil;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class MongoDaoImpl extends LogUtil implements MongoDao {
  @Resource
  private MongoTemplate mongoTemplate;
  private GridFsTemplate gridFsTemplate;
  @Override
  public void insert(Persion persion) {
    this.mongoTemplate.save(persion);
  }
  @Override
  public void find(Persion persion) {
    try {
      Query query = new Query(new Criteria());
      System.out.println(query);
      List<Persion> list = this.mongoTemplate.find(query, Persion.class);
      for (Persion persion2 : list) {
        System.out.println(persion2);
        // Persion persion3 = persion2.getPersion();
        // System.out.println(persion3.getId());
        this.log.info(persion2.toString());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public void testdao(Persion persion) {
    Criteria criteria = new Criteria("name");
    criteria.is("name123456");
    Query query = new Query(criteria);
    Update update = new Update();
    update.update("name", "name");
    this.mongoTemplate.updateFirst(query, update, Persion.class);
  }
  @Override
  public void test() {
    // gridFsTemplate.store(content, metadata)
  }
  @Override
  public void update(Persion persion) {
    Criteria criteria = new Criteria("name");
    criteria.is("name123456");
    Query query = new Query(criteria);
    Update update = new Update();
    update.update("name", "name_kkkkk_" + System.currentTimeMillis());
    this.mongoTemplate.updateFirst(query, update, Persion.class);
  }
  @Override
  public void delete(Persion persion) {
    Criteria criteria = new Criteria("name");
    criteria.is(persion.getName());
    Query query = new Query();
    this.mongoTemplate.dropCollection(Persion.class);
    System.out.println(query);
    // System.out.println(mongoTemplate.remove(query, Persion.class));
  }
}
