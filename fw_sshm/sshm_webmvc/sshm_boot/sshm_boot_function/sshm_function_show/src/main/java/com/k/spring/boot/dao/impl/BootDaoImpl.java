package com.k.spring.boot.dao.impl;

import com.k.spring.boot.dao.BootDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class BootDaoImpl implements BootDao {
    @Override
    public void boot() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("boot");
    }
}
