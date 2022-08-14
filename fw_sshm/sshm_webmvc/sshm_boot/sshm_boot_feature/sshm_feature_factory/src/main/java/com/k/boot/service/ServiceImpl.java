package com.k.boot.service;

import com.k.boot.model.ModelProperty;
import com.k.boot.model.ModelSingle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl {
    @Autowired
    private ModelSingle modelSingle;
    @Autowired
    private ModelProperty modelProperty;
}
