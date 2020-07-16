package com.admin.service;

import com.admin.dao.UserDao;
import com.admin.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public int register(User user) {
        return 0;
    }

    @Override
    public int grant(User user) {
        return userDao.grant(user);
    }

    @Override
    public int deleteStudent(String username) {
        return userDao.deleteStudent(username);
    }
}
