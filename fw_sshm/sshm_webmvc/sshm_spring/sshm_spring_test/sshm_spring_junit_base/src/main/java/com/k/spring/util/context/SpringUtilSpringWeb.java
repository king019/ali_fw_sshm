package com.k.spring.util.context;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

@Slf4j
public class SpringUtilSpringWeb extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private WebApplicationContext context;

    @Override
    public void init() throws ServletException {
        super.init();
        String webAppRootKey = getServletContext().getRealPath("/");
        log.debug("webapp.app is [" + webAppRootKey + "]");
        System.setProperty("webapp.root", webAppRootKey);
        context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
    }
}
