package com.k.boot.control;

import com.k.boot.service.ServiceInface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Slf4j
@RestController
public class BootControl {
    @Autowired
    private List<ServiceInface> facesList;
    @Autowired
    private Set<ServiceInface> faceSet;
    @Autowired
    @Resource
    private Map<String, ServiceInface> faceMap;

    @GetMapping(value = "/index")
    String index() {
        log.info("BootControl home");
        return "ok";
    }
}
