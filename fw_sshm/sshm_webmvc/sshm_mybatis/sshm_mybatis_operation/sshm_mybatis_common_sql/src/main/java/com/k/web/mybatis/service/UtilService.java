package com.k.web.mybatis.service;

import com.k.web.mybatis.base.vo.PageBean;
import com.k.web.mybatis.util.DBEnum;

import java.util.List;

public interface UtilService<T> {
    public void intertObj(Object obj, Class clazz);

    public void intertObj(Object obj, Class clazz, DBEnum dbEnum);

    public void updateObj(Object obj, Class clazz);

    public void updateObj(Object obj, Class clazz, DBEnum dbEnum);

    public void deleteObj(Object obj, Class clazz, DBEnum dbEnum);

    public void deleteObj(Object obj, Class clazz);

    public Object queryObjOne(Object obj, Class clazz, DBEnum dbEnum);

    public Object queryObjOne(Object obj, Class clazz);

    public List<T> queryObjList(Object obj, Class clazz, DBEnum dbEnum);

    public List<T> queryObjList(Object obj, Class clazz);

    public PageBean queryObjPageList(Object obj, int pageNo, int pageSize, Class clazz);

    public PageBean queryObjPageList(Object obj, int pageNo, int pageSize, Class clazz, DBEnum dbEnum);
}
