package com.k.spring.boot.mybatis.dao;

import com.k.spring.boot.mybatis.dto.Tb;

import java.util.List;

public interface TbSqlMapper {
    List<Tb> selectByExample();
}