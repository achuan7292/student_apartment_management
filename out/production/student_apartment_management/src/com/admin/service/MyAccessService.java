package com.admin.service;

import com.admin.domain.Access;

import java.util.List;

public interface MyAccessService {
    List<Access> selAccessRecords(Access access);

    /**
     * 学生登入登出记录
     */
    int addAccessRecord(Access access);
}
