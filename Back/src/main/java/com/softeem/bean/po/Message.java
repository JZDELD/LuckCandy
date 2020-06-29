package com.softeem.bean.po;

import java.io.Serializable;
import java.util.Date;

/**
 * message
 * @author 
 */
public class Message implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer adminId;

    private Date time;

    private String userContent;

    private String adminContent;

    private Integer userNew;

    private Integer adminNew;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUserContent() {
        return userContent;
    }

    public void setUserContent(String userContent) {
        this.userContent = userContent;
    }

    public String getAdminContent() {
        return adminContent;
    }

    public void setAdminContent(String adminContent) {
        this.adminContent = adminContent;
    }

    public Integer getUserNew() {
        return userNew;
    }

    public void setUserNew(Integer userNew) {
        this.userNew = userNew;
    }

    public Integer getAdminNew() {
        return adminNew;
    }

    public void setAdminNew(Integer adminNew) {
        this.adminNew = adminNew;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}