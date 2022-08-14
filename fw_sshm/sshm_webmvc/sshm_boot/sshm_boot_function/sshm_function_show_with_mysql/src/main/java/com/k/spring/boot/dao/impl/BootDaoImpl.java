package com.k.spring.boot.dao.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.k.spring.boot.dao.BootDao;
import com.k.spring.boot.mybatis.dao.TbSqlMapper;
import com.k.spring.boot.mybatis.dto.Tb;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
@Slf4j
public class BootDaoImpl implements BootDao {
    @Autowired
    @Qualifier("writeDataSource")
    private DruidDataSource druidDataSource;
    //    @Autowired
//    private TbMapper tbMapper;
    @Autowired
    private TbSqlMapper tbSqlMapper;

    @Override
    public void boot() {
        try {
            DruidPooledConnection connect = druidDataSource.getConnection();
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        log.info("boot");
    }

    @Override
    public int insert() {
        Tb tb = new Tb();
        tb.setTbName("name");
        //tbMapper.insert(tb);
        return 0;
    }

    @Override
    public int delete() {
        return 0;
    }

    @Override
    public List<Tb> query() {
        return tbSqlMapper.selectByExample();
    }
}
