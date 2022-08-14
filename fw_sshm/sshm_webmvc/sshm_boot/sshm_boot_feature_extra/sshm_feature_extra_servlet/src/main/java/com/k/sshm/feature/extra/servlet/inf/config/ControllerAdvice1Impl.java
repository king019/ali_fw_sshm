package com.k.sshm.feature.extra.servlet.inf.config;

import com.k.sshm.feature.extra.servlet.model.ModelMV;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

@Slf4j
@ControllerAdvice
public class ControllerAdvice1Impl {
    @Order(1)
    @ExceptionHandler(Exception.class)
    public void exception(HttpServletRequest request, HttpServletResponse resp, Exception e) throws IOException {
        resp.setStatus(200);
        resp.getOutputStream().print("ok");
    }

    //    @Order(2)//无效
//    @ExceptionHandler(RuntimeException.class)
//    public void runtimeException(RuntimeException e,
//                                 HandlerMethod method,
//                                 HttpServletRequest servletRequest,
//                                 HttpServletResponse servletResponse,
//                                 HttpSession httpSession,
//                                 HttpMethod httpMethod
//    ) throws IOException {
//        servletResponse.setStatus(200);
//        servletResponse.getOutputStream().print("ok");
//    }
    @Order(2)//无效
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ModelMV runtimeException(RuntimeException e ) {
        ModelMV mv = new ModelMV();
        mv.setId("ca");
        return mv;
    }
}
