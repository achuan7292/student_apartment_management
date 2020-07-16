package com.admin.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SmartTable {
    @JsonProperty("data")
    private List<Student> data;
    private int code;
    private String msg;
    private int count;

    public List<Student> getStudents() {
        return data;
    }

    public void setStudents(List<Student> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
