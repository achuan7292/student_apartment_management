package com.admin.service;

import com.admin.dao.AccessDao;
import com.admin.domain.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyAccessServiceImpl implements MyAccessService {

    @Autowired
    AccessDao accessDao;

    @Override
    public List<Access> selAccessRecords(Access access) {
        return accessDao.selAccessRecords(access);

    }

    @Override
    public int addAccessRecord(Access access) {

        return accessDao.addAccessRecord(access);
    }
}
