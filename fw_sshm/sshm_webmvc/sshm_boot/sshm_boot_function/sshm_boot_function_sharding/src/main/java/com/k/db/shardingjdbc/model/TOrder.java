package com.k.db.shardingjdbc.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TOrder implements Serializable {

    private Integer id;

    private String userId;

    private String orderId;

    private static final long serialVersionUID = 1L;

}