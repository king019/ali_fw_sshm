package com.k.web.mybatis.dao.impl;

import com.k.web.mybatis.dao.MybatisTestDao;
import com.k.web.mybatis.dao.base.dao.BaseDao;
import com.k.web.mybatis.dao.base.vo.ParamObj;
import com.k.web.mybatis.model.VO;
import com.k.web.mybatis.util.DbOperation;
import lombok.extern.slf4j.Slf4j;
import mockit.Injectable;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
@Slf4j
public class MybatisTestDaoImpl implements MybatisTestDao {
    private final String mappernamespace = "com.k.web.mybatis.dao.MybatisTestDao.";
    @Injectable
    @Resource
    private BaseDao baseDao;

    @Override
    public List<VO> select(VO vo, DbOperation db) throws Exception {
        ParamObj obj = new ParamObj();
        obj.setDs(db.getVal());
        obj.setSqlId(mappernamespace.concat("select"));
        obj.setCondition(vo);
        return baseDao.getDataList(obj);
    }

    @Override
    public List<VO> selectMap(VO vo, DbOperation db) throws Exception {
        ParamObj obj = new ParamObj();
        obj.setDs(db.getVal());
        obj.setSqlId(mappernamespace.concat("selectmap"));
        obj.setCondition(vo);
        return baseDao.getDataList(obj);
    }

    @Override
    public void insert(VO vo, DbOperation db) throws Exception {
        // log.info(MybatisTestDaoImpl.class.getName());
        ParamObj obj = new ParamObj();
        obj.setDs(db.getVal());
        obj.setSqlId(mappernamespace.concat("insert"));
        obj.setCondition(vo);
        baseDao.insertObj(obj);
    }

    @Override
    public void insert2(VO vo, DbOperation db) throws Exception {
        log.info(MybatisTestDaoImpl.class.getName());
        ParamObj obj = new ParamObj();
        obj.setDs(DbOperation.df2.getVal());
        obj.setSqlId(mappernamespace.concat("insert"));
        obj.setCondition(vo);
        baseDao.insertObj(obj);
    }

    @Override
    public void update(VO vo, DbOperation db) throws Exception {
        ParamObj obj = new ParamObj();
        obj.setDs(db.getVal());
        obj.setSqlId(mappernamespace.concat("update"));
        obj.setCondition(vo);
        baseDao.updateObj(obj);
    }

    @Override
    public void delete(VO vo, DbOperation db) throws Exception {
        ParamObj obj = new ParamObj();
        obj.setDs(db.getVal());
        obj.setSqlId(mappernamespace.concat("delete"));
        obj.setCondition(vo);
        baseDao.deleteObj(obj);
    }
}
