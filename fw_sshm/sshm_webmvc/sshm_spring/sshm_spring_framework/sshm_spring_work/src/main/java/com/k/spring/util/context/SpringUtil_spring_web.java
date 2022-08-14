package com.k.spring.util.context;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

@Slf4j
public class SpringUtil_spring_web extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        String webAppRootKey = getServletContext().getRealPath("/");
        //log.debug("webapp.app is [" + webAppRootKey + "]");
        System.setProperty("webapp.root", webAppRootKey);
        WebApplicationContext c = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
    }
}
