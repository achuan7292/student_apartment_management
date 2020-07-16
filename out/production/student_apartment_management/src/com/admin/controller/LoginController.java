package com.admin.controller;

import com.admin.domain.Result;
import com.admin.domain.User;
import com.admin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    //   登录接口
    @RequestMapping("/login")
    public User login(User user, HttpSession session) {
        User user2 = loginService.login(user);
        if (user2 != null) {
            session.setAttribute("user", user2);
        }
        return user2;
    }
//    @RequestMapping("/register")
//    public  User register(User user, HttpSession session) {
//        int i = loginService.register(user);
//        if (user2 != null) {
//            session.setAttribute("user", user2);
//        }
//        return user2;
//    }

    //  获取登录用户
    @RequestMapping("/get_user")
    public User getUser(HttpSession session) {
        return (User) session.getAttribute("user");
    }

    @RequestMapping("/grant")
    public Result grant(User user) {
        int i = loginService.grant(user);
        if (i > 0) {
            return new Result(true, "");
        } else {
            return new Result(false, "");
        }
    }

    @RequestMapping("/delete_student")
    public Result deleteStudent(String username) {
        int i = loginService.deleteStudent(username);
        if (i > 0) {
            return new Result(true, "");
        } else {
            return new Result(false, "");
        }
    }
}
