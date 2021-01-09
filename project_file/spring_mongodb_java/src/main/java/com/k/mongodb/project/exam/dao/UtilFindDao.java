package com.k.mongodb.project.exam.dao;
import java.util.List;
import org.springframework.data.mongodb.core.query.Query;
public interface UtilFindDao {
  public <T> List<T> find(Query query, Class<T> entityClass) throws Exception;
}
