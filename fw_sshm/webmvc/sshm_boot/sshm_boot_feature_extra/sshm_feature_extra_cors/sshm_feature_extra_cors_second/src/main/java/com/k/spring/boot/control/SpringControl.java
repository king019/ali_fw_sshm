package com.k.spring.boot.control;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringControl {

  @RequestMapping("/index")
  @ResponseBody
  public String index(String key) {
    return "{}";
  }
}
