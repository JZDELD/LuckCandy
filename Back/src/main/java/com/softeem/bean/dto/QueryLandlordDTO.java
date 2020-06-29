package com.softeem.bean.dto;

public class QueryLandlordDTO {
    private Integer queryId;
    private String queryName;
    private String queryHome;
    private Integer pageNow = 1;

    public Integer getQueryId() {
        return queryId;
    }

    public void setQueryId(Integer queryId) {
        this.queryId = queryId;
    }

    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    public String getQueryHome() {
        return queryHome;
    }

    public void setQueryHome(String queryHome) {
        this.queryHome = queryHome;
    }

    public Integer getPageNow() {
        return pageNow;
    }

    public void setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
    }
}
