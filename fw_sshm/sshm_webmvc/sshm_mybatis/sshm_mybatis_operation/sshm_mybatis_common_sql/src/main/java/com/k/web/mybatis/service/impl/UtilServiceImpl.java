package com.k.web.mybatis.service.impl;

import com.k.web.mybatis.base.vo.PageBean;
import com.k.web.mybatis.dao.UtilDao;
import com.k.web.mybatis.service.UtilService;
import com.k.web.mybatis.util.DBEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UtilServiceImpl implements UtilService {
    @Resource
    private UtilDao utilDao;

    @Override
    public void intertObj(Object obj, Class clazz) {
        utilDao.intertObj(obj, clazz, null);
    }

    @Override
    public void intertObj(Object obj, Class clazz, DBEnum dbEnum) {
        utilDao.intertObj(obj, clazz, dbEnum);
    }

    @Override
    public void updateObj(Object obj, Class clazz) {
        utilDao.updateObj(obj, clazz, null);
    }

    @Override
    public void updateObj(Object obj, Class clazz, DBEnum dbEnum) {
        utilDao.updateObj(obj, clazz, dbEnum);
    }

    @Override
    public void deleteObj(Object obj, Class clazz) {
        utilDao.deleteObj(obj, clazz, null);
    }

    @Override
    public void deleteObj(Object obj, Class clazz, DBEnum dbEnum) {
        utilDao.deleteObj(obj, clazz, dbEnum);
    }

    @Override
    public Object queryObjOne(Object obj, Class clazz) {
        return utilDao.queryObjOne(obj, clazz, null);
    }

    @Override
    public Object queryObjOne(Object obj, Class clazz, DBEnum dbEnum) {
        return utilDao.queryObjOne(obj, clazz, dbEnum);
    }

    @Override
    public List queryObjList(Object obj, Class clazz) {
        return utilDao.queryObjList(obj, clazz, null);
    }

    @Override
    public List queryObjList(Object obj, Class clazz, DBEnum dbEnum) {
        return utilDao.queryObjList(obj, clazz, dbEnum);
    }

    @Override
    public PageBean queryObjPageList(Object obj, int pageNo, int pageSize, Class clazz) {
        return utilDao.queryObjPageList(obj, pageNo, pageSize, clazz, null);
    }

    @Override
    public PageBean queryObjPageList(Object obj, int pageNo, int pageSize, Class clazz, DBEnum dbEnum) {
        return utilDao.queryObjPageList(obj, pageNo, pageSize, clazz, dbEnum);
    }
}
