package com.softeem.bean.po;

import java.io.Serializable;

/**
 * configuration
 * @author 
 */
public class Configuration implements Serializable {
    private Integer id;

    private Integer bed;

    private Integer bathroom;

    private Integer airConditioning;

    private Integer TV;

    private Integer router;

    private Integer smartLock;

    private Integer rangeHood;

    private Integer refrigerator;

    private Integer microwaveOven;

    private Integer yuba;

    private Integer washingMachine;

    private Integer wardrobe;

    private Integer table;

    private Integer chair;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBed() {
        return bed;
    }

    public void setBed(Integer bed) {
        this.bed = bed;
    }

    public Integer getBathroom() {
        return bathroom;
    }

    public void setBathroom(Integer bathroom) {
        this.bathroom = bathroom;
    }

    public Integer getAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(Integer airConditioning) {
        this.airConditioning = airConditioning;
    }

    public Integer getTV() {
        return TV;
    }

    public void setTV(Integer TV) {
        this.TV = TV;
    }

    public Integer getRouter() {
        return router;
    }

    public void setRouter(Integer router) {
        this.router = router;
    }

    public Integer getSmartLock() {
        return smartLock;
    }

    public void setSmartLock(Integer smartLock) {
        this.smartLock = smartLock;
    }

    public Integer getRangeHood() {
        return rangeHood;
    }

    public void setRangeHood(Integer rangeHood) {
        this.rangeHood = rangeHood;
    }

    public Integer getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Integer refrigerator) {
        this.refrigerator = refrigerator;
    }

    public Integer getMicrowaveOven() {
        return microwaveOven;
    }

    public void setMicrowaveOven(Integer microwaveOven) {
        this.microwaveOven = microwaveOven;
    }

    public Integer getYuba() {
        return yuba;
    }

    public void setYuba(Integer yuba) {
        this.yuba = yuba;
    }

    public Integer getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(Integer washingMachine) {
        this.washingMachine = washingMachine;
    }

    public Integer getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(Integer wardrobe) {
        this.wardrobe = wardrobe;
    }

    public Integer getTable() {
        return table;
    }

    public void setTable(Integer table) {
        this.table = table;
    }

    public Integer getChair() {
        return chair;
    }

    public void setChair(Integer chair) {
        this.chair = chair;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}