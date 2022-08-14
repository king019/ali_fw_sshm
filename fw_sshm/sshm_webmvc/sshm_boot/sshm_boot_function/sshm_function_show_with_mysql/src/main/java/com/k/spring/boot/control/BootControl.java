package com.k.spring.boot.control;

import com.k.spring.boot.dao.BootDao;
import com.k.spring.boot.mybatis.dto.Tb;
import com.k.spring.boot.service.BootService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ComponentScan(basePackages = {"com.k.spring.boot"})
@EnableAutoConfiguration
public class BootControl {
    @Autowired
    private BootDao bootDao;
    @Autowired
    private BootService bootService;

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    //@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @GetMapping(value = "/index")
    @ResponseBody
    String index() {
        bootService.boot();
        return "Hello World!";
    }

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    //@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @GetMapping(value = "/createTable")
    @ResponseBody
    String createTable() {
        bootService.boot();
        return "Hello World!";
    }

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    //@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @GetMapping(value = "/insert")
    @ResponseBody
    String insert() {
        bootDao.insert();
        return "Hello World!";
    }

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    //@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @GetMapping(value = "/delete")
    @ResponseBody
    String delete() {
        bootService.boot();
        return "Hello World!";
    }

    @GetMapping(value = "/query")
    @ResponseBody
    List<Tb> query() {
        return bootService.select();
    }
}
