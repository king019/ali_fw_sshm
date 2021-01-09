package com.k.mongodb.project.exam.service.impl;
import com.k.mongodb.project.exam.dao.UtilDao;
import com.k.mongodb.project.exam.service.UtilService;
import com.mongodb.WriteResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.data.mongodb.core.mapreduce.GroupBy;
import org.springframework.data.mongodb.core.mapreduce.GroupByResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
@Service
public class UtilServiceImpl implements UtilService {
  @Resource
  private UtilDao utilDao;
  @Override
  public Map insert(Object obj) throws Exception {
    Map map = new HashMap();
    utilDao.insert(obj);
    return map;
  }
  @Override
  public void inserts(List objs) throws Exception {
    utilDao.inserts(objs);
  }
  @Override
  public WriteResult remove(Object obj) throws Exception {
    return utilDao.remove(obj);
  }
  @Override
  public List<WriteResult> remove(List<Object> objs) throws Exception {
    return utilDao.remove(objs);
  }
  @Override
  public void updateFirst(Query query, Update update, Class clazz) throws Exception {
    utilDao.updateFirst(query, update, clazz);
  }
  @Override
  public <T> GroupByResults<T> group(Criteria criteria, String inputCollectionName, GroupBy groupBy, Class<T> entityClass) {
    return utilDao.group(criteria, inputCollectionName, groupBy, entityClass);
  }
  @Override
  public <T> GroupByResults<T> group(String inputCollectionName, GroupBy groupBy, Class<T> entityClass) {
    return utilDao.group(inputCollectionName, groupBy, entityClass);
  }
}
