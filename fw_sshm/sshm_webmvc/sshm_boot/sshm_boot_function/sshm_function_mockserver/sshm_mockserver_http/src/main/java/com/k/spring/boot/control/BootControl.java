package com.k.spring.boot.control;

import com.google.common.collect.Lists;
import com.k.spring.boot.model.HttpRequestModel;
import com.k.spring.boot.model.HttpRequestModel.HttpRequestModelBuilder;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;

@RestController
public class BootControl {


    @RequestMapping(path = {"/", "/path"})
    @ResponseBody
    public HttpRequestModel home(HttpServletRequest request) {
        HttpRequestModelBuilder builder = HttpRequestModel.builder();
        String method = request.getMethod();
        String requestURI = request.getRequestURI();
        String queryString = request.getQueryString();
        builder.method(method);
        builder.requestURI(requestURI);
        builder.queryString(queryString);
        builder.pairs(buildHead(request));
        return builder.build();
    }

    private List<Pair> buildHead(HttpServletRequest request) {
        List<Pair> list = Lists.newLinkedList();
        Enumeration<String> names = request.getHeaderNames();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String header = request.getHeader(name);
            Pair<String, String> pair = Pair.of(name, header);
            list.add(pair);
        }
        return list;
    }


}
