package com.tongchen.carpool.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by tongchen on 2016-10-08.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {
    @Resource
    private UserDao userDao;

    @Test
    public void insertUserInfo() throws Exception {
        userDao.insertUserInfo("TongChen","123456",5199914217L,1);
    }
    @Test
    public void checkUser() throws Exception{
        if (userDao.checkUser("TongChe",5199914217L)!=0){
            System.out.println("不合格");
        }
    }
    @Test
    public void userLogin() throws Exception{
        if (userDao.userLogin("TongChen","123456")!=null){
            System.out.println(userDao.userLogin("TongChen","123456").toString());
        }
    }
}