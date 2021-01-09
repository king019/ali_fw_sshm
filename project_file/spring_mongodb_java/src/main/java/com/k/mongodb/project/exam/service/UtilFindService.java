package com.k.mongodb.project.exam.service;
import java.util.List;
import org.springframework.data.mongodb.core.query.Query;
public interface UtilFindService {
  public <T> List<T> find(Query query, Class<T> entityClass) throws Exception;
}
