package com.lnb.user.service;

import com.lnb.user.bean.User;
import com.lnb.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getAllUser() {
        return userDao.findAll();
    }

    public User getById(Long id) {
        return userDao.findOne(id);
    }
}
