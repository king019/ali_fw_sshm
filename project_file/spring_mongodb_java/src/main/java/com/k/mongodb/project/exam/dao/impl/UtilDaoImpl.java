package com.k.mongodb.project.exam.dao.impl;
import com.k.mongodb.project.exam.dao.UtilDao;
import com.mongodb.WriteResult;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapreduce.GroupBy;
import org.springframework.data.mongodb.core.mapreduce.GroupByResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
@Repository
public class UtilDaoImpl implements UtilDao {
  @Resource
  private MongoTemplate mongoTemplate;
  @Override
  public void insert(Object obj) throws Exception {
    mongoTemplate.insert(obj);
  }
  @Override
  public void inserts(List objs) throws Exception {
    mongoTemplate.insertAll(objs);
  }
  @Override
  public WriteResult remove(Object obj) throws Exception {
    return mongoTemplate.remove(obj);
  }
  @Override
  public List<WriteResult> remove(List<Object> objs) throws Exception {
    List<WriteResult> list = new ArrayList<WriteResult>();
    for (Object object : objs) {
      list.add(mongoTemplate.remove(object));
    }
    return list;
  }
  @Override
  public void updateFirst(Query query, Update update, Class clazz) throws Exception {
    mongoTemplate.updateFirst(query, update, clazz);
  }
  @Override
  public <T> GroupByResults<T> group(Criteria criteria, String inputCollectionName, GroupBy groupBy, Class<T> entityClass) {
    return mongoTemplate.group(criteria, inputCollectionName, groupBy, entityClass);
  }
  @Override
  public <T> GroupByResults<T> group(String inputCollectionName, GroupBy groupBy, Class<T> entityClass) {
    return mongoTemplate.group(inputCollectionName, groupBy, entityClass);
  }
}
