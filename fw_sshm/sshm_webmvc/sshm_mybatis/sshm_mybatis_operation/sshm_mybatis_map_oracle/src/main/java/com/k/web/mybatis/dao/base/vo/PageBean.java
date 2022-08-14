package com.k.web.mybatis.dao.base.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageBean implements Serializable {
    private static final long serialVersionUID = 2647073846755242380L;
    private boolean nextPage = true;
    private boolean upPage = true;
    private int totalPage;
    private int countResults;
    private int currentlyPage = 1;
    private List dataList;
    private int start;
    private int end;
    private int pageSize = 20;

    public PageBean() {
    }

    public PageBean(int currentlyPage, int pageSize, Integer recordsCount) {
        this.pageSize = pageSize <= 0 ? 1 : pageSize;
        countResults = recordsCount;
        int tempTotalPage = countResults / pageSize;
        int tempNum = countResults % pageSize;
        if (tempNum > 0) {
            tempTotalPage++;
        }
        totalPage = tempTotalPage;
        if (currentlyPage <= 0) {
            this.currentlyPage = 1;
        } else if (currentlyPage > totalPage) {
            this.currentlyPage = totalPage;
        } else {
            this.currentlyPage = currentlyPage;
        }
        start = (this.currentlyPage - 1) * this.pageSize + 1;
        end = this.currentlyPage * this.pageSize;
        if (this.currentlyPage == 1) {
            upPage = false;
        }
        if (this.currentlyPage == totalPage) {
            nextPage = false;
        }
    }
}
