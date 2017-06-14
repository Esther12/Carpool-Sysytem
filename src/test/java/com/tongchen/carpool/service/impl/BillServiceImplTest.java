package com.tongchen.carpool.service.impl;

import com.tongchen.carpool.service.BillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by tongchen on 2016-11-06.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class BillServiceImplTest {
    @Autowired
    private BillService billService;
    @Test
    public void getMyBill() throws Exception {
        billService.getMyBill(1000L);
    }

    @Test
    public void successBill() throws Exception {
        billService.successBill(1L);
    }

    @Test
    public void cancelBill() throws Exception {
        billService.cancelBill(3L);
    }

    @Test
    public void generateBill() throws Exception {
        billService.generateBill(1,1000L,1002L);
    }

}