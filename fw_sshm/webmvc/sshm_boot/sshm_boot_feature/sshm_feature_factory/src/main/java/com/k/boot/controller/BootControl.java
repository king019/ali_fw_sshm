package com.k.boot.controller;

import com.k.boot.model.ModelProperty;
import com.k.boot.model.ModelSingle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootControl {
    //    @Autowired
//    private ModelSingle modelSingle;
//    @Autowired
//    private ModelProperty modelProperty;
    @Autowired
    private ApplicationContext context;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    String home(boolean single) {
        if (single) {
            ModelSingle singleBean = context.getBean(ModelSingle.class);
        } else {
            ModelProperty bean = context.getBean(ModelProperty.class);
        }
        return "ok";
    }
}
