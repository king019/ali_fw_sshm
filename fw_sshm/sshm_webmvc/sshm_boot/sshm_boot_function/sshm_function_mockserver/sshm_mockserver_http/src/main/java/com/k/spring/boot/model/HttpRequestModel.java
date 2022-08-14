package com.k.spring.boot.model;

import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

@Data
@Builder
public class HttpRequestModel {

    String method;
    String requestURI;
    String queryString;
    String version;
    List<Pair> pairs;
}