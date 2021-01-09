package com.k.atomikos.repository.secondary;

import com.k.atomikos.entity.Test2;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface Test2Dao {

    Test2 getById(Long id);

    @Transactional
    Long add(Test2 t);
}
