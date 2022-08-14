package com.k.boot.show;

import com.k.boot.inf.ServiceInf;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Slf4j
public class Control {
    @Autowired
    private List<ServiceInf> infs;

    @PostConstruct
    public void init() {
        log.info("", infs);
    }
}
