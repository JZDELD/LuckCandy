package com.softeem.bean.dto;

import com.softeem.bean.po.*;

public class HouseDTO {
    //房屋状态 0:合租 1:空闲 2:预租 3:转租 4:已出租 5:已下架
    private String[] status = {"合租", "空闲", "预租", "转租", "已出租", "已下架"};
    private House house;
    private City city;
    private Region region;
    private Subway subway;
    private Landlord landlord;
    //业务员
    private Salesman salesman;
    //房屋配置
    private Configuration configuration;

    public String[] getStatus() {
        return status;
    }

    public void setStatus(String[] status) {
        this.status = status;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Subway getSubway() {
        return subway;
    }

    public void setSubway(Subway subway) {
        this.subway = subway;
    }

    public Landlord getLandlord() {
        return landlord;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
}
