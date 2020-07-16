package com.admin.dao;

import com.admin.domain.User;

public interface UserDao {

    public User login(User user);

    int grant(User user);

    int deleteStudent(String username);
}
