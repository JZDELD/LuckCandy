package com.softeem.bean.dto;

public class QueryContractDTO {
    private Integer queryId;
    private Integer queryUserId;
    private Integer queryStatus;
    private Integer pageNow = 1;

    public Integer getQueryId() {
        return queryId;
    }

    public void setQueryId(Integer queryId) {
        this.queryId = queryId;
    }

    public Integer getQueryUserId() {
        return queryUserId;
    }

    public void setQueryUserId(Integer queryUserId) {
        this.queryUserId = queryUserId;
    }

    public Integer getQueryStatus() {
        return queryStatus;
    }

    public void setQueryStatus(Integer queryStatus) {
        this.queryStatus = queryStatus;
    }

    public Integer getPageNow() {
        return pageNow;
    }

    public void setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
    }
}
