package com.softeem.bean.dto;

public class QueryHouseDTO {
    //房屋ID
    private Integer queryId;
    //房屋状态 0:合租 1:空闲 2:预租 3:转租 4:已出租 5:已下架
    private Integer queryStatus;
    //城市Id
    private Integer queryCityId;
    //房东ID
    private Integer queryLandlordId;

    private Integer pageNow = 1;

    public Integer getQueryId() {
        return queryId;
    }

    public void setQueryId(Integer queryId) {
        this.queryId = queryId;
    }

    public Integer getQueryStatus() {
        return queryStatus;
    }

    public void setQueryStatus(Integer queryStatus) {
        this.queryStatus = queryStatus;
    }

    public Integer getQueryCityId() {
        return queryCityId;
    }

    public void setQueryCityId(Integer queryCityId) {
        this.queryCityId = queryCityId;
    }

    public Integer getQueryLandlordId() {
        return queryLandlordId;
    }

    public void setQueryLandlordId(Integer queryLandlordId) {
        this.queryLandlordId = queryLandlordId;
    }

    public Integer getPageNow() {
        return pageNow;
    }

    public void setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
    }
}
