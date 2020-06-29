package com.softeem.bean.po;

import java.io.Serializable;

/**
 * certification
 * @author 
 */
public class Certification implements Serializable {
    private Integer id;

    private String name;

    private String idNum;

    private String idPicPo;

    private String idPicNe;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getIdPicPo() {
        return idPicPo;
    }

    public void setIdPicPo(String idPicPo) {
        this.idPicPo = idPicPo;
    }

    public String getIdPicNe() {
        return idPicNe;
    }

    public void setIdPicNe(String idPicNe) {
        this.idPicNe = idPicNe;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}