package com.k.mongodb.project.exam.service.impl;
import com.k.mongodb.project.exam.dao.UtilFindDao;
import com.k.mongodb.project.exam.service.UtilFindService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
@Service
public class UtilFindServiceImpl implements UtilFindService {
  @Resource
  private UtilFindDao utilFindDao;
  @Override
  public <T> List<T> find(Query query, Class<T> entityClass) throws Exception {
    return utilFindDao.find(query, entityClass);
  }
}
