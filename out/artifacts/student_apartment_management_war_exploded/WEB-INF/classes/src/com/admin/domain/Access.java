package com.admin.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Access {
    // select  sid, sname, sex, coll,major, access_records.buildingNum,
//    access_records.layerNum,access_records.hostelNo, time1, behavior,
//    from access_records,student where student.sid = access_records.sid;
    private Integer sid;
    private String sname;
    private Integer sex;
    private String coll;
    private String major;
    private Integer buildingNum;
    private Integer layerNum;
    private Integer hostelNo;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date time1;
    private String behavior;

    public Integer getSid() {
        return sid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getColl() {
        return coll;
    }

    public void setColl(String coll) {
        this.coll = coll;
    }

    public Integer getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(Integer buildingNum) {
        this.buildingNum = buildingNum;
    }

    public Integer getLayerNum() {
        return layerNum;
    }

    public void setLayerNum(Integer layerNum) {
        this.layerNum = layerNum;
    }

    public Integer getHostelNo() {
        return hostelNo;
    }

    public void setHostelNo(Integer hostelNo) {
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
