package com.k.spring.boot.control;

import com.k.spring.boot.anno.TransService;
import com.k.spring.boot.async.AsyncService;
import com.k.spring.boot.server.ServiceServer1;
import com.k.spring.boot.server.ServiceServer2;
import com.k.spring.boot.service.BootService;
import com.k.spring.boot.service.BootTryService;
import com.k.spring.boot.util.BootProperty;
import com.k.spring.boot.util.config.yaml.EnvironmentsConfig;
import com.k.spring.boot.util.config.yaml.MyConfig;
import com.k.spring.boot.util.vo.VO1;
import com.k.spring.boot.util.vo.VOConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

//@RestController
@RestController@Slf4j
//@RequestMapping(value = "/")
public class BootControl {

    @Value("${boot.id}")
    private String bootId;
    @Value("${environments.dev.url}")
    private String product;
    @Autowired
    private BootService bootService;
    @Autowired
    private BootProperty bootProperty;
    @Autowired
    private VOConfig voConfig;
    @Resource(name = "v1Bean")
    private VO1 vo1;
    @Autowired
    private EnvironmentsConfig environmentsConfig;
    @Autowired
    private MyConfig myConfig;
    @Autowired
    private List<BootTryService> bootTryServices;
    @Autowired
    private AsyncService asyncService;
    @Autowired
    private TransService transService;
    @Autowired
    private ServiceServer1 serviceServer1;
    @Autowired
    private ServiceServer2 serviceServer2;

    @PostConstruct
    private void init() {
        log.info("",bootTryServices);
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index(HttpServletRequest request) {
        bootService.boot();
        asyncService.asyncCs();
        log.info("",voConfig);
        log.info("",vo1);
        log.info("",environmentsConfig);
        log.info("",myConfig);
        return "Hello World!" + bootProperty.getDriver();
    }

    @RequestMapping(value = "/throwerror", method = RequestMethod.GET)
    public User deleteUser(@PathVariable Long user) {
        throw new RuntimeException("1");
    }

    @RequestMapping(value = "/insertUser", method = RequestMethod.GET)
    public User insertUser(@PathVariable Long user) {
        return new User();
    }

    @RequestMapping(value = "/anno", method = RequestMethod.GET)
    public void anno() {
        transService.service();
    }
}
