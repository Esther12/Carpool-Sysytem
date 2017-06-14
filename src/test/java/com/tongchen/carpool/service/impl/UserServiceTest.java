package com.tongchen.carpool.service.impl;

import com.tongchen.carpool.entity.User;
import com.tongchen.carpool.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by tongchen on 2016-11-02.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class UserServiceTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    @Test
    public void userLogin() throws Exception {
        User user=userService.userLogin("chentong","123456");
        logger.info("user={}",user);
    }

    @Test
    public void isExistUser() throws Exception {
        boolean b  = userService.isExistUser("chent",51L);
        logger.info("b={}",b);
    }

    @Test
    public void insertNewUser() throws Exception {
        boolean a=userService.insertNewUser("chentong","123456",5199914217L,1);
    }

}