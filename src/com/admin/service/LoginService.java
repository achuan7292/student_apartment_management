package com.admin.service;

import com.admin.domain.User;

public interface LoginService {
    User login(User user);

    int register(User user);

    int grant(User user);

    int deleteStudent(String username);
}
