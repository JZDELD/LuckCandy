package com.softeem.bean.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * house
 * @author 
 */
public class House implements Serializable {
    private Integer id;

    private String houseType;

    private Integer landlordId;

    private Integer status;

    private String title;

    private String introduction;

    private Integer elevator;

    private Integer time;

    private Integer degreeOfGreening;

    private BigDecimal area;

    private Double monthlyPrice;

    private Double seasonPrice;

    private Double halfYearPrice;

    private Double servicePrice;

    private Double deposit;

    private Integer cityId;

    private Integer regionId;

    private Integer salesmanId;

    private String address;

    private Integer configurationId;

    private Integer subwayId;

    private String communityName;

    private String businessCircleName;

    private Integer totalFloor;

    private Integer nowFloor;

    private Integer collectNum;

    private String image;

    private String video;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public Integer getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(Integer landlordId) {
        this.landlordId = landlordId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getElevator() {
        return elevator;
    }

    public void setElevator(Integer elevator) {
        this.elevator = elevator;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getDegreeOfGreening() {
        return degreeOfGreening;
    }

    public void setDegreeOfGreening(Integer degreeOfGreening) {
        this.degreeOfGreening = degreeOfGreening;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public Double getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(Double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public Double getSeasonPrice() {
        return seasonPrice;
    }

    public void setSeasonPrice(Double seasonPrice) {
        this.seasonPrice = seasonPrice;
    }

    public Double getHalfYearPrice() {
        return halfYearPrice;
    }

    public void setHalfYearPrice(Double halfYearPrice) {
        this.halfYearPrice = halfYearPrice;
    }

    public Double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

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

    public Integer getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(Integer salesmanId) {
        this.salesmanId = salesmanId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(Integer configurationId) {
        this.configurationId = configurationId;
    }

    public Integer getSubwayId() {
        return subwayId;
    }

    public void setSubwayId(Integer subwayId) {
        this.subwayId = subwayId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getBusinessCircleName() {
        return businessCircleName;
    }

    public void setBusinessCircleName(String businessCircleName) {
        this.businessCircleName = businessCircleName;
    }

    public Integer getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(Integer totalFloor) {
        this.totalFloor = totalFloor;
    }

    public Integer getNowFloor() {
        return nowFloor;
    }

    public void setNowFloor(Integer nowFloor) {
        this.nowFloor = nowFloor;
    }

    public Integer getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(Integer collectNum) {
        this.collectNum = collectNum;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}