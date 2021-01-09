package com.k.mongodb.project.exam.service;
import com.mongodb.WriteResult;
import java.util.List;
import java.util.Map;
import org.springframework.data.mongodb.core.mapreduce.GroupBy;
import org.springframework.data.mongodb.core.mapreduce.GroupByResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
public interface UtilService {
  public Map insert(Object obj) throws Exception;
  public void inserts(List objs) throws Exception;
  public void updateFirst(Query query, Update update, Class clazz) throws Exception;
  public WriteResult remove(Object obj) throws Exception;
  public List<WriteResult> remove(List<Object> objs) throws Exception;
  //
  public <T> GroupByResults<T> group(Criteria criteria, String inputCollectionName, GroupBy groupBy, Class<T> entityClass);
  public <T> GroupByResults<T> group(String inputCollectionName, GroupBy groupBy, Class<T> entityClass);
}
