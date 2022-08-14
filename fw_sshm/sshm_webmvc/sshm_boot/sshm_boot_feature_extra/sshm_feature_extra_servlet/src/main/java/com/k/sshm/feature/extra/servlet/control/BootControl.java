package com.k.sshm.feature.extra.servlet.control;

import com.k.sshm.feature.extra.servlet.model.ModelMV;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Order(1)
@RestController
public class BootControl {

    @PostMapping("/error")
    public String post(@RequestBody ModelMV obj) {
        throw new RuntimeException();
    }

    @PostMapping("/error1")
    public ModelMV error1(@RequestBody ModelMV obj) {
        throw new RuntimeException();
    }

    @PostMapping("/index")
    public ModelMV index() {
        ModelMV modelMV = new ModelMV();
        return modelMV;
    }
}
