package com.k.spring.control;

import com.k.spring.service.IService;
import com.k.spring.util.AnnoClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class BootControl {
    @AnnoClass
    @Autowired
    private List<IService> services;

    @ResponseBody
    @GetMapping(value = "/index")
    Map<Integer, Integer> index() {
        return Map.of(1, 1);
    }
}
