package com.k.redis.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/**
 * @author http://blog.csdn.net/java2000_wl
 * @version <b>1.0</b>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -6011241820070393952L;
    private String id;
    private String name;
    private String password;
}
