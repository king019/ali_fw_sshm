package com.k.sshm.feature.extra.servlet.control;

import com.k.sshm.feature.extra.servlet.model.ModelMV;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Order(1)
@RestController
@RequestMapping("/cors")
@CrossOrigin(origins = "https://domain2.com")
public class BootCORSControl {

    @PostMapping(value = "/cors")
    public String cors(@RequestBody ModelMV obj) {
        return "ok";
    }

}
