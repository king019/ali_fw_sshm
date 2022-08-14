package com.k.sshm.feature.extra.servlet.inf.config;

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
@ControllerAdvice//order=0
public class ControllerAdvice2Impl {


    @Order(1)//无效
    @ExceptionHandler(Exception.class)
    public void exception(HttpServletRequest request, HttpServletResponse resp, Exception e) throws IOException {
        resp.setStatus(200);
        resp.getOutputStream().print("ok");
    }

    @Order(2)//无效
    @ExceptionHandler(RuntimeException.class)
    public void runtimeException(HttpServletRequest request, HttpServletResponse resp, RuntimeException e) throws IOException {
        resp.setStatus(200);
        resp.getOutputStream().print("ok");
    }


    @ExceptionHandler(NullPointerException.class)
    //@ResponseBody
    //HttpEntity<B>, ResponseEntity<B>
    //String view name
    //View
    //java.util.Map, org.springframework.ui.Model
    //@ModelAttribute
    //ModelAndView
    //void
    //Any other return value
    public ModelAndView customException2(
            NullPointerException e,
            HandlerMethod method,
            WebRequest request,
            NativeWebRequest nativeWebRequest,
            ServletRequest servletRequest,
            ServletResponse servletResponse,
            HttpSession httpSession,
            HttpMethod httpMethod,
            TimeZone timeZone,
            ZoneId zoneId,
            OutputStream outputStream,
            Writer writer,
            Map map,
            Model model,
            ModelMap modelMap,
            RedirectAttributes redirectAttributes


    ) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", e.getMessage());
        mv.setViewName("myerror");
        return mv;
    }

}
