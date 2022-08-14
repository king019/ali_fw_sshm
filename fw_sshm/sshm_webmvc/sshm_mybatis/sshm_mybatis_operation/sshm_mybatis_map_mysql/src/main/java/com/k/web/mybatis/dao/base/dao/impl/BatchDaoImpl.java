package com.k.web.mybatis.dao.base.dao.impl;

import com.k.web.mybatis.dao.base.dao.BatchDao;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 批量处理 insert、update、delete
 */
@Data
@Repository
public class BatchDaoImpl implements BatchDao {
    @Resource(name = "sqlSessionMap")
    private Map<String, SqlSessionFactory> sqlSessionBeans;

    @Override
    public long insertBatchObjects(List obj, String dataSource, String sqlId) {
        SqlSessionFactory sqlSessionFactory = sqlSessionBeans.get(dataSource);
        if (obj == null || obj.isEmpty()) {
            return -1;
        }
        int insertResult = 0;
        SqlSession session = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        try {
            for (Object object : obj) {
                if (object != null) {
                    insertResult += session.insert(sqlId, object);
                } else {
                    insertResult += session.insert(sqlId);
                }
                if (insertResult % 100 == 0) {
                    session.commit();
                }
            }
            session.commit();
        } finally {
            session.close();
        }
        return insertResult;
    }

    @Override
    public long updateBatchObjects(List obj, String dataSource, String sqlId) {
        SqlSessionFactory sqlSessionFactory = sqlSessionBeans.get(dataSource);
        if (obj == null || obj.isEmpty()) {
            return -1;
        }
        int updateResult = 0;
        SqlSession session = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        try {
            for (Object object : obj) {
                if (object != null) {
                    updateResult += session.update(sqlId, object);
                } else {
                    updateResult += session.update(sqlId);
                }
                if (updateResult % 100 == 0) {
                    session.commit();
                }
            }
            session.commit();
        } finally {
            session.close();
        }
        return updateResult;
    }

    @Override
    public <T> long insertList(String sqlId, String dataSource, List<T> list) {
        SqlSessionFactory sqlSessionFactory = sqlSessionBeans.get(dataSource);
        if (CollectionUtils.isEmpty(list)) {
            return -1;
        }
        int insertResult = 0;
        SqlSession session = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        try {
            for (int i = 0; i < list.size(); i++) {
                T object = list.get(i);
                if (object != null) {
                    insertResult += session.insert(sqlId, object);
                } else {
                    insertResult += session.insert(sqlId);
                }
                if (i % 1000 == 0) {
                    session.commit();
                    session.clearCache();
                }
            }
            session.commit();
        } finally {
            session.close();
        }
        return insertResult;
    }

    @Override
    public <T> long insertBatchList(String sqlId, String dataSource, List<T> list) {
        SqlSessionFactory sqlSessionFactory = sqlSessionBeans.get(dataSource);
        if (CollectionUtils.isEmpty(list)) {
            return -1;
        }
        int insertResult = 0;
        SqlSession session = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        try {
            insertResult = session.insert(sqlId, list);
        } finally {
            session.close();
        }
        return insertResult;
    }

}
