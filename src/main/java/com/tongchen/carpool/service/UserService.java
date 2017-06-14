package com.tongchen.carpool.service;

import com.tongchen.carpool.entity.User;

/**
 * Created by tongchen on 2016-10-15.
 */
public interface UserService {

    User userLogin(String userName,String userPassword);

    boolean isExistUser(String userName, long userTele);

    boolean insertNewUser(String userName, String userPassword, long userTele, int userIdentity);
}
