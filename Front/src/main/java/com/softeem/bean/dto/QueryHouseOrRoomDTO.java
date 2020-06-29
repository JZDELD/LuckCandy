package com.softeem.bean.dto;

import java.math.BigDecimal;

public class QueryHouseOrRoomDTO {
    private Integer cityId;
    private Integer regionId;
    private Integer subwayId;
    private String communityOrBusinessCircleName;
    private Integer rentType;
    private Integer status;
    private BigDecimal areaMin;
    private BigDecimal areaMax;
    private Double priceMin;
    private Double priceMax;
    private String houseIds;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getSubwayId() {
        return subwayId;
    }

    public void setSubwayId(Integer subwayId) {
        this.subwayId = subwayId;
    }

    public String getCommunityOrBusinessCircleName() {
        return communityOrBusinessCircleName;
    }

    public void setCommunityOrBusinessCircleName(String communityOrBusinessCircleName) {
        this.communityOrBusinessCircleName = communityOrBusinessCircleName;
    }

    public Integer getRentType() {
        return rentType;
    }

    public void setRentType(Integer rentType) {
        this.rentType = rentType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getAreaMin() {
        return areaMin;
    }

    public void setAreaMin(BigDecimal areaMin) {
        this.areaMin = areaMin;
    }

    public BigDecimal getAreaMax() {
        return areaMax;
    }

    public void setAreaMax(BigDecimal areaMax) {
        this.areaMax = areaMax;
    }

    public Double getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(Double priceMin) {
        this.priceMin = priceMin;
    }

    public Double getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(Double priceMax) {
        this.priceMax = priceMax;
    }

    public String getHouseIds() {
        return houseIds;
    }

    public void setHouseIds(String houseIds) {
        this.houseIds = houseIds;
    }
}
