package com.k.spring.boot.control;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiOperation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@Api(tags = "用户管理")
@RequestMapping(value = "/")
public class Boot2ControlSwagger {

    //    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
//    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @GetMapping("/addusers")
    @ResponseBody
    public String addUser(Long user) {
        return "{}";
    }

    //    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
//    @ApiImplicitParam(name = "delusers", value = "用户详细实体user", required = true, dataType = "User")
    @GetMapping("/delusers")
    public String deleteUser(Long user) {
        return "123";
    }
}


