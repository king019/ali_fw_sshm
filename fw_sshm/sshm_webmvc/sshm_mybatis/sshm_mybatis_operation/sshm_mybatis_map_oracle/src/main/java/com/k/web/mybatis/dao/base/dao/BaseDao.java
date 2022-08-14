package com.k.web.mybatis.dao.base.dao;

import com.k.web.mybatis.dao.base.vo.PageBean;
import com.k.web.mybatis.dao.base.vo.ParamObj;

import java.util.List;

public interface BaseDao {
    /**
     * 执行数据库插入操作
     *
     * @param condition :
     */
    public int insertObj(ParamObj condition);

    /**
     * 分页查询操作
     *
     * @param condition     ： 分页条件
     * @param currentlyPage ：当前第几页
     * @param pageSize      ：每页多少条
     */
    public PageBean getDataListForPage(ParamObj condition, int pageNo, int pageSize);

    /**
     * 根据条件查询结果列表
     *
     * @param condition ：查询条件
     * @return 查询结果列表
     */
    public List getDataList(ParamObj condition);

    /**
     * 根据条件查询单个结果
     */
    public Object getObject(ParamObj condition);

    /**
     * 根据条件更新操作
     */
    public int updateObj(ParamObj condition);

    /**
     * 根据条件删除的操作
     */
    public int deleteObj(ParamObj condition);
}
