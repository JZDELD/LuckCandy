package com.softeem.bean.dto;

public class QueryUserDTO {
    private Integer queryId;
    private String queryUserName;
    private String queryHome;
    private Integer PageNow = 1;

    public Integer getQueryId() {
        return queryId;
    }

    public void setQueryId(Integer queryId) {
        this.queryId = queryId;
    }

    public String getQueryUserName() {
        return queryUserName;
    }

    public void setQueryUserName(String queryUserName) {
        this.queryUserName = queryUserName;
    }

    public String getQueryHome() {
        return queryHome;
    }

    public void setQueryHome(String queryHome) {
        this.queryHome = queryHome;
    }

    public Integer getPageNow() {
        return PageNow;
    }

    public void setPageNow(Integer pageNow) {
        PageNow = pageNow;
    }
}
