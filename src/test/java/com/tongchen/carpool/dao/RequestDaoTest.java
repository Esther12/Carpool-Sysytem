package com.tongchen.carpool.dao;

import com.tongchen.carpool.entity.Request;
import com.tongchen.carpool.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by tongchen on 2016-10-12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class RequestDaoTest {
    @Resource
    RequestDao requestDao;
    Request request = new Request();
    User user = new User();
    Date date =new Date();
    Timestamp timeStamp = new Timestamp(date.getTime());

    @Test
    public void insertNewRequest() throws Exception {
        user.setUserId(1000L);
        request.setBeginPlace("Windsor");
        request.setBeginTime(timeStamp);
        request.setEndPlace("toronto");
        request.setPrice(40);
        request.setUser(user);
        requestDao.insertNewRequest(request);
    }

    @Test
    public void getRequestOfDriver() throws Exception {
        List<Request> list=requestDao.getRequestOfDriver();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }

    @Test
    public void getRequestOfPassenger() throws Exception {
        List<Request> list=requestDao.getRequestOfPassenger();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }

    @Test
    public void getMyRequest() throws Exception {
        List<Request> list=requestDao.getMyRequest(1000L);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }

}