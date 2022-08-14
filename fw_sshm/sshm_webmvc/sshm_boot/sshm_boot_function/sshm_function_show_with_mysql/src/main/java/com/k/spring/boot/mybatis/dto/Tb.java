package com.k.spring.boot.mybatis.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Tb implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String tbName;

}