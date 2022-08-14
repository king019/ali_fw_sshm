package com.k.spring.boot.control.swigger;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiOperation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Api(tags = "用户管理")
@Controller
@RequestMapping(value = "/")

public class Boot2Control {

    //    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
//    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @GetMapping(value = "/adduser")
    @ResponseBody
    public String addUser(Long user) {
        return "{}";
    }

    //    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
//    @ApiImplicitParam(name = "deluser", value = "用户详细实体user", required = true, dataType = "User")
    @GetMapping(value = "/deluser")
    public String deleteUser(Long user) {
        return "123";
    }
}


