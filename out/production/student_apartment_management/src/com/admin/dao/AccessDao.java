package com.admin.dao;

import com.admin.domain.Access;

import java.util.List;

public interface AccessDao {

    List<Access> selAccessRecords(Access access);

    /**
     * 学生登入登出记录
     */
    int addAccessRecord(Access access);
}
