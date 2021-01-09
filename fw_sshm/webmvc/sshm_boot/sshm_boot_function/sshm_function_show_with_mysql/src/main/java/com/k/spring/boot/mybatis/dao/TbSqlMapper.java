package com.k.spring.boot.mybatis.dao;

import com.k.spring.boot.mybatis.dto.Tb;
import com.k.spring.boot.mybatis.dto.TbExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSqlMapper {
  List<Tb> selectByExample();
}