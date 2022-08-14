package com.k.spring.boot.control;

import com.k.spring.boot.inf.JbdcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SpringControl {
    @Autowired
    private JbdcConfig.Mybatis mybatis;

    public String index() {
        return mybatis.getUrl();
    }

}
