package com.k.web.mybatis.dao.impl;

import com.k.web.mybatis.dao.MybatisTestDao;
import com.k.web.mybatis.dao.base.dao.BaseDao;
import com.k.web.mybatis.dao.base.vo.ParamObj;
import com.k.web.mybatis.model.VO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class MybatisTestDaoImpl implements MybatisTestDao {
    private final String DEFAULT_DS = "df";
    private final String mappernamespace = "com.k.web.mybatis.dao.MybatisTestDao.";
    @Resource
    private BaseDao baseDao;

    @Override
    public List<VO> select(VO vo) throws Exception {
        ParamObj obj = new ParamObj();
        obj.setDs(DEFAULT_DS);
        obj.setSqlId(mappernamespace.concat("select"));
        obj.setCondition(vo);
        return baseDao.getDataList(obj);
    }

    @Override
    public void insert(VO vo) throws Exception {
        {
        }
        ParamObj obj = new ParamObj();
        obj.setDs(DEFAULT_DS);
        obj.setSqlId(mappernamespace.concat("insert"));
        obj.setCondition(vo);
        baseDao.insertObj(obj);
    }

    @Override
    public void update(VO vo) throws Exception {
        ParamObj obj = new ParamObj();
        obj.setDs(DEFAULT_DS);
        obj.setSqlId(mappernamespace.concat("update"));
        obj.setCondition(vo);
        baseDao.updateObj(obj);
    }

    @Override
    public void delete(VO vo) throws Exception {
        ParamObj obj = new ParamObj();
        obj.setDs(DEFAULT_DS);
        obj.setSqlId(mappernamespace.concat("delete"));
        obj.setCondition(vo);
        baseDao.deleteObj(obj);
    }
}
