package com.k.atomikos.repository.primary;

import com.k.atomikos.entity.Test1;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface Test1Dao {

    Test1 getById(Long id);

    @Transactional
    Long add(Test1 t);
}
