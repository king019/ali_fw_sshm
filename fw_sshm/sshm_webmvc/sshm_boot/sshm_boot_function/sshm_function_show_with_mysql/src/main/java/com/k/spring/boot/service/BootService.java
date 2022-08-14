package com.k.spring.boot.service;

import com.k.spring.boot.mybatis.dto.Tb;

import java.util.List;

public interface BootService {
    void boot();

    List<Tb> select();
}
