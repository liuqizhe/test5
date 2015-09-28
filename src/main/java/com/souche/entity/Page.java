package com.souche.entity;

/**
 * Created by liuqizhe on 15/9/25.
 */
public class Page {
    private Integer page = 1 ;
    private Integer pageSize = 5 ;
    private Integer totalPage = 1 ;

    public Integer getBegin() {
        return (page - 1)*pageSize ;
    }

    public Integer getEnd() {
        return page*pageSize +1 ;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
