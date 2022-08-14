package com.k.sshm.feature.extra.validation.control;

import com.google.common.collect.Maps;
import com.k.sshm.feature.extra.validation.model.ModelParentValid;
import com.k.sshm.feature.extra.validation.model.ModelParentValidated;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

/**
 * https://segmentfault.com/a/1190000038859664
 */
@Slf4j
@Order(1)
@RestController
public class BootControl {

    @GetMapping(value = "/valid")
    public Map<Object, Object> valid(@Valid @RequestBody ModelParentValid model) {
        return Maps.newHashMap();
    }
    @GetMapping(value = "/validated")
    public Map<Object, Object> validated(@Validated @RequestBody ModelParentValidated model) {
        return Maps.newHashMap();
    }

}
