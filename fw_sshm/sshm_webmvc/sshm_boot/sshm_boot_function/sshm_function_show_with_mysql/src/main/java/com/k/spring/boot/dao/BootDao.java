package com.k.spring.boot.dao;

import com.k.spring.boot.mybatis.dto.Tb;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = Exception.class)
public interface BootDao {
    void boot();

    int insert();

    int delete();

    List<Tb> query();
}
