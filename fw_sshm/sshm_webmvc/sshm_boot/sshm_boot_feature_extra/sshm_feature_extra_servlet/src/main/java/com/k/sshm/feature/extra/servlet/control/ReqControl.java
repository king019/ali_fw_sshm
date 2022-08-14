package com.k.sshm.feature.extra.servlet.control;

import com.k.sshm.feature.extra.servlet.model.ModelMV;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/req")
public class ReqControl {
    @GetMapping("/get/{id}")
    public ModelMV get(@PathVariable Long id) {
        return new ModelMV();
    }

    @PostMapping("/post")
    public String post() {
        return "ok";
    }

    @RequestMapping(method = RequestMethod.HEAD, path = "/head")
    public String head() {
        return "ok";
    }

    @PutMapping("/put")
    public ModelMV put() {
        return new ModelMV();
    }

    @DeleteMapping("/delete")
    public ModelMV delete() {
        return new ModelMV();
    }

}
