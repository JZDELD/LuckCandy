package com.softeem.bean.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * room
 * @author 
 */
public class Room implements Serializable {
    private Integer id;

    private Integer houseId;

    private Integer configurationId;

    private String title;

    private String introduction;

    private BigDecimal area;

    private Double monthlyPrice;

    private Double seasonPrice;

    private Double halfYearPrice;

    private Double servicePrice;

    private Double deposit;

    private Integer status;

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

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(Integer configurationId) {
        this.configurationId = configurationId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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