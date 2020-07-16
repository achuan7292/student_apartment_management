package com.admin.domain;

import java.util.List;

public class Dormitory {
    private int buildingNum;
    private int layerNum;
    private int hostelNo;
    private int sid;
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
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

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
