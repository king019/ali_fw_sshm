package com.k.web.mybatis.base.dao;

import java.util.List;

public interface BatchDao {
    /**
     * 批量插入数据
     *
     * @param dataSource 数据源
     */
    long insertBatchObjects(List list, String dataSource, String sqlId);

    /**
     * 批量更新数据
     */
    long updateBatchObjects(List list, String dataSource, String sqlId);

    <T> long insertList(String sqlId, String dataSource, List<T> list);

    <T> long insertBatchList(String sqlId, String dataSource, List<T> list);
}
