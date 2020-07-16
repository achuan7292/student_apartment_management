package com.admin.domain;

import java.util.Date;

public class Visitor {
    private int sid;
    private String NAME;
    private int sex;
    private String coll;
    private int buildingNum;
    private int layerNum;
    private int hostelNo;
    private Date time1;
    private String behavior;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getColl() {
        return coll;
    }

    public void setColl(String coll) {
        this.coll = coll;
    }

    public int getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(int buildingNum) {
        this.buildingNum = buildingNum;
    }

    public int getLayerNum() {
        return layerNum;
    }

    public void setLayerNum(int layerNum) {
        this.layerNum = layerNum;
    }

    public int getHostelNo() {
        return hostelNo;
    }

    public void setHostelNo(int hostelNo) {
        this.hostelNo = hostelNo;
    }

    public Date getTime1() {
        return time1;
    }

    public void setTime1(Date time1) {
        this.time1 = time1;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }
}
