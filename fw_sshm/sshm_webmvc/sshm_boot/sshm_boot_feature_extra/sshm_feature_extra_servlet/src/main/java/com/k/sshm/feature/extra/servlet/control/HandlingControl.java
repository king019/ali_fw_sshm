package com.k.sshm.feature.extra.servlet.control;

import com.k.sshm.feature.extra.servlet.model.ModelMV;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.RequestDispatcher;
import java.io.IOException;

@RestController
@RequestMapping("/handling")
public class HandlingControl {

    @PostMapping(value = "/redirect")
    public String redirect(@RequestBody ModelMV obj) {
        return "redirect:/myapp/some/resource";
    }

    @PostMapping(value = "/forward")
    public String forward(@RequestBody ModelMV obj) {
        return "forward:/index.action";
    }
}
