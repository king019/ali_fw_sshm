package com.k.boot.control;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Order(1)
@RestController
public class BootControl {

    @GetMapping(value = "/index")
    String index() {
        log.info("BootControl home");
        //return "redirect:/ toList ";
        //eturn "redirect:/user/save/result";
        // return "forward:/index.action";
        //RequestDispatcher dispatcher=request.getRequestDispacher("/servlet/LifeCycleServlet");
        //dispatcher.forward(request,response);
//        return "ok";
        throw new RuntimeException();
    }

    @GetMapping(value = "/mget")
    String mget() {
        return "ok";
    }

    @GetMapping(value = "/exc")
    String error() {
        throw new RuntimeException();
    }
}
