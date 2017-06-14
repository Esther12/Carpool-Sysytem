package com.tongchen.carpool.service.impl;

import com.tongchen.carpool.dao.UserDao;
import com.tongchen.carpool.entity.User;
import com.tongchen.carpool.service.UserService;
import com.tongchen.carpool.tool.PasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tongchen on 2016-10-20.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public User userLogin(String userName, String userPassword) {
        String md5Password = PasswordGenerator.getMD5Password(userPassword);
        return userDao.userLogin(userName,md5Password);
    }

    public boolean isExistUser(String userName, long userTele) {
        if (userDao.checkUser(userName,userTele)>0){
            return true;
        }else
            return false;
    }

    public boolean insertNewUser(String userName, String userPassword, long userTele, int userIdentity) {
        String md5Password = PasswordGenerator.getMD5Password(userPassword);
        if (userDao.insertUserInfo(userName,md5Password,userTele,userIdentity)>0){
            return true;
        }else {
            return false;
        }
    }
}
