package com.k.spring.boot.extra.swigger.control.swigger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "用户管理")
@RequestMapping(value = "/")
public class Boot2ControlSwagger {

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "ApiImplicitParam", required = false, dataType = "string")
    @GetMapping(value = "/index")
    @ResponseBody
    public String index(@RequestParam Long user) {
        return "{}";
    }

}


