package com.k.spring.boot.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
@Slf4j
public class ControlAdviceConfig {
    @ModelAttribute
    public void advice(Model model) {
        log.info("", this);
        log.info("", model);
    }
}
