package com.softeem.bean.dto;

import com.softeem.bean.po.Configuration;
import com.softeem.bean.po.Room;

public class RoomDTO {
    private Room room;
    //房屋状态 0:合租 1:空闲 2:预租 3:转租 4:已出租 5:已下架
    private String[] status = {"合租", "空闲", "预租", "转租", "已出租", "已下架"};
    //房屋配置
    private Configuration configuration;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String[] getStatus() {
        return status;
    }

    public void setStatus(String[] status) {
        this.status = status;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
}
