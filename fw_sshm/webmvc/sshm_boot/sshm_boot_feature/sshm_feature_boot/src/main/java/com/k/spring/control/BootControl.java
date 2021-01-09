package com.k.spring.control;

import com.k.spring.service.IService;
import com.k.spring.util.AnnoClass;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class BootControl {
@AnnoClass
  @Autowired
  private List<IService> services;

  @ResponseBody
  @RequestMapping(value = "/index")
  Map<Integer, Integer> index() {
    return Map.of(1, 1);
  }
}
