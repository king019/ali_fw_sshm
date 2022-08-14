package com.k.atomikos.web;

import com.k.atomikos.service.Test1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    private Test1Service test1Service;

    @GetMapping("/index")
    @ResponseBody
    public String index() {
        test1Service.save();
        return "";
    }
}
