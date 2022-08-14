package com.k.web.mybatis.dao.impl;

import com.k.web.mybatis.base.dao.BaseDao;
import com.k.web.mybatis.base.dao.BatchDao;
import com.k.web.mybatis.base.vo.PageBean;
import com.k.web.mybatis.base.vo.ParamObj;
import com.k.web.mybatis.dao.UtilDao;
import com.k.web.mybatis.util.DBEnum;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UtilDaoImpl implements UtilDao {
    private final String DEFAULT_DS = "cscenter";
    @Resource
    private BaseDao baseDao;
    @Resource
    private BatchDao batchDao;

    private String dbName(DBEnum dbEnum) {
        if (dbEnum == null) {
            return DEFAULT_DS;
        } else {
            return dbEnum.getDbName();
        }
    }

    @Override
    public void intertObj(Object obj, Class clazz, DBEnum dbEnum) {
        ParamObj pm = new ParamObj();
        pm.setDs(dbName(dbEnum));
        pm.setCondition(obj);
        pm.setSqlId(clazz.getName().concat(".intertObj"));
        baseDao.insertObj(pm);
    }

    @Override
    public void updateObj(Object obj, Class clazz, DBEnum dbEnum) {
        ParamObj pm = new ParamObj();
        pm.setDs(dbName(dbEnum));
        pm.setCondition(obj);
        pm.setSqlId(clazz.getName().concat(".updateObj"));
        baseDao.updateObj(pm);
    }

    @Override
    public void deleteObj(Object obj, Class clazz, DBEnum dbEnum) {
        ParamObj pm = new ParamObj();
        pm.setDs(dbName(dbEnum));
        pm.setCondition(obj);
        pm.setSqlId(clazz.getName().concat(".deleteObj"));
        baseDao.deleteObj(pm);
    }

    @Override
    public Object queryObjOne(Object obj, Class clazz, DBEnum dbEnum) {
        ParamObj pm = new ParamObj();
        pm.setDs(dbName(dbEnum));
        pm.setCondition(obj);
        pm.setSqlId(clazz.getName().concat(".queryObjOne"));
        return baseDao.getObject(pm);
    }

    @Override
    public List queryObjList(Object obj, Class clazz, DBEnum dbEnum) {
        ParamObj pm = new ParamObj();
        pm.setDs(dbName(dbEnum));
        pm.setCondition(obj);
        pm.setSqlId(clazz.getName().concat(".queryObjList"));
        return baseDao.getDataList(pm);
    }

    @Override
    public PageBean queryObjPageList(Object obj, int pageNo, int pageSize, Class clazz, DBEnum dbEnum) {
        ParamObj pm = new ParamObj();
        pm.setDs(dbName(dbEnum));
        pm.setCondition(obj);
        pm.setSqlId(clazz.getName().concat(".queryObjPageList"));
        return baseDao.getDataListForPage(pm, pageNo, pageSize);
    }
}
