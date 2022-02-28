package com.ys.ioc.service;

import com.ys.ioc.dao.UserDao;

public class UserService {

    private UserDao userDao;

    public void add(){
        System.out.println("UserService add......");
        userDao.userUpdate();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
