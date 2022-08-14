package com.k.web.mybatis.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VO {
    private Integer id;
    private String vname;
    private boolean vflag;

    public VO(Integer id) {
        super();
        this.id = id;
    }

    public VO(Integer id, String vname) {
        super();
        this.id = id;
        this.vname = vname;
    }
}
