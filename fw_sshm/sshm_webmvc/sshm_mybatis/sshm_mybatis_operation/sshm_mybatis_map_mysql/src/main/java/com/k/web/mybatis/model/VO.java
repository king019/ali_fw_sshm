package com.k.web.mybatis.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class VO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String vname;
}
