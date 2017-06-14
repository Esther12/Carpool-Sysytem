package com.tongchen.carpool.service.impl;

import com.tongchen.carpool.entity.Request;
import com.tongchen.carpool.entity.User;
import com.tongchen.carpool.service.RequestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by tongchen on 2016-11-02.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class RequestServiceImplTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private RequestService requestService;
    @Test
    public void getRequestList() throws Exception {

    }

    @Test
    public void insertNewRequest() throws Exception {
        Request request= new Request();
        User user = new User();
        Date date =new Date();
        Timestamp timeStamp = new Timestamp(date.getTime());
        user.setUserId(1L);
        request.setBeginPlace("Windsor");
        request.setBeginTime(timeStamp);
        request.setEndPlace("toronto");
        request.setPrice(40);
        request.setUser(user);
        requestService.insertNewRequest(request);
    }

    @Test
    public void getMyRequest() throws Exception {
        List<Request> list=requestService.getMyRequest(1000L);
        for(Request request:list){
            logger.info("request={}",request);
        }
    }

    @Test
    public void cancelRequest() throws Exception {
        requestService.cancelRequest(1001L);
    }

}