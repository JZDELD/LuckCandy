package com.softeem.bean.po;

import java.io.Serializable;
import java.util.Date;

/**
 * bill
 * @author 
 */
public class Bill implements Serializable {
    private Integer id;

    private Integer total;

    private Integer now;

    private Double price;

    private Double servicePrice;

    private Integer userId;

    private Date paymentTime;

    private Date billStart;

    private Date billEnd;

    private Date payEnd;

    private Integer status;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getNow() {
        return now;
    }

    public void setNow(Integer now) {
        this.now = now;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getBillStart() {
        return billStart;
    }

    public void setBillStart(Date billStart) {
        this.billStart = billStart;
    }

    public Date getBillEnd() {
        return billEnd;
    }

    public void setBillEnd(Date billEnd) {
        this.billEnd = billEnd;
    }

    public Date getPayEnd() {
        return payEnd;
    }

    public void setPayEnd(Date payEnd) {
        this.payEnd = payEnd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}