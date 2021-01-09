package com.k.spring.boot.control;
import com.k.spring.boot.dao.BootDao;
import com.k.spring.boot.mybatis.dto.Tb;
import com.k.spring.boot.service.BootService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
  @RequestMapping(value = "/index", method = RequestMethod.GET)
  @ResponseBody
  String index() {
    bootService.boot();
    return "Hello World!";
  }
  @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
  //@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
  @RequestMapping(value = "/createTable", method = RequestMethod.GET)
  @ResponseBody
  String createTable() {
    bootService.boot();
    return "Hello World!";
  }
  @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
  //@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
  @RequestMapping(value = "/insert", method = RequestMethod.GET)
  @ResponseBody
  String insert() {
    bootDao.insert();
    return "Hello World!";
  }
  @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
  //@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
  @RequestMapping(value = "/delete", method = RequestMethod.GET)
  @ResponseBody
  String delete() {
    bootService.boot();
    return "Hello World!";
  }
  @RequestMapping(value = "/query", method = RequestMethod.GET)
  @ResponseBody
  List<Tb> query( ) {
    return bootService.select();
  }
}
