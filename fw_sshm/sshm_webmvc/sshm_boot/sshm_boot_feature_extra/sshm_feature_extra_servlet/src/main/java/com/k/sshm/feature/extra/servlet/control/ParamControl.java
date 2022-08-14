package com.k.sshm.feature.extra.servlet.control;

import com.k.sshm.feature.extra.servlet.model.ModelMV;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

@Controller
@RequestMapping("/param")
public class ParamControl {
    @ResponseBody
    @PostMapping(path = "/post", consumes = "application/json", produces = "application/json", headers = "myHeader=myValue")
    public String post(@RequestBody ModelMV pet, Reader reader, ServletRequest req, ServletResponse resp) {
        return "ok";
    }

    @GetMapping("/get/{id}")
    public ModelMV get(@PathVariable Long id, HttpSession session, HttpMethod method, InputStream input, OutputStream output, Writer writer) {
        return new ModelMV();
    }

    @PostMapping("/param")
    @ResponseBody
    public ModelMV param(@RequestParam String id, @RequestHeader("Accept-Encoding") String encoding, @RequestHeader("Keep-Alive") long keepAlive, @CookieValue("JSESSIONID") String cookie) {
        return new ModelMV();
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            byte[] bytes = file.getBytes();
            return "redirect:uploadSuccess";
        }
        return "redirect:uploadFailure";
    }
    @PostMapping("/resp")
    @ResponseBody
    public ModelMV param() {
        ModelMV modelMV = new ModelMV();
        modelMV.setId("123");
        return modelMV;
    }
}
