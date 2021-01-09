package com.k.mongodb.project.exam.dao.impl;
import com.k.mongodb.project.exam.dao.UtilFindDao;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
@Repository
public class UtilFindDaoImpl implements UtilFindDao {
  @Resource
  private MongoTemplate mongoTemplate;
  @Override
  public <T> List<T> find(Query query, Class<T> entityClass) throws Exception {
    return mongoTemplate.find(query, entityClass);
  }
}
