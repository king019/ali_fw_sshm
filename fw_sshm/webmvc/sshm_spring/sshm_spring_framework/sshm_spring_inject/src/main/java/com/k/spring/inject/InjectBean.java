package com.k.spring.inject;

import com.k.spring.inject.autowire.AutoWireBean;
import com.k.spring.inject.resource.ResourceBean;
import com.k.spring.inject.resource.impl.ResourceBeanImpl2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component@Slf4j
public class InjectBean {
  // @Autowired(required = true)
  // @Qualifier("autoWireBeanImpl1222")
  private AutoWireBean autoWireBean;
  @Resource(name = "resourceBeanImpl1", type = ResourceBeanImpl2.class)
  // @Resource(type = ResourceBeanImpl2.class)
  // @Resource
  private ResourceBean resourceBean;
  public void test() {
    log.info("" + autoWireBean + resourceBean);
  }
}
