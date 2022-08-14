package com.k.web.mybatis.dao;

import com.k.web.mybatis.base.vo.PageBean;
import com.k.web.mybatis.util.DBEnum;

import java.util.List;

public interface UtilDao {
    public void intertObj(Object obj, Class clazz, DBEnum dbEnum);

    public void updateObj(Object obj, Class clazz, DBEnum dbEnum);

    public void deleteObj(Object obj, Class clazz, DBEnum dbEnum);

    public Object queryObjOne(Object obj, Class clazz, DBEnum dbEnum);

    public List queryObjList(Object obj, Class clazz, DBEnum dbEnum);

    public PageBean queryObjPageList(Object obj, int pageNo, int pageSize, Class clazz, DBEnum dbEnum);
}
