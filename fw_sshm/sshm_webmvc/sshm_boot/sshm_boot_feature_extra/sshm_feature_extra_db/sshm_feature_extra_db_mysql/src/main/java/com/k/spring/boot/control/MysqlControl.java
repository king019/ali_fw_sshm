package com.k.spring.boot.control;

import com.k.spring.boot.dao.BootDao;
import com.k.spring.boot.service.BootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MysqlControl {

    @Autowired
    private BootDao bootDao;
    @Autowired
    private BootService bootService;

    @GetMapping("/index")
    @ResponseBody
    String index() {
        bootService.insert();
        bootService.query();
        return "Hello World!";
    }

}
