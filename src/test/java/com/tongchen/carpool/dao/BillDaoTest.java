package com.tongchen.carpool.dao;

import com.tongchen.carpool.entity.Bill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by tongchen on 2016-10-12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class BillDaoTest {
    @Resource
    private BillDao billDao;

    @Test
    public void insertBillInfo() throws Exception {
        int i=billDao.insertBillInfo(1000L,1002L);
        System.out.println(i);
    }

    @Test
    public void cancelBill() throws Exception {
        billDao.cancelBill(1000L);
    }

    @Test
    public void getMyBill() throws Exception {
        List<Bill> billList=billDao.getMyBill(1000L);
        for (Bill bill:billList
             ) {
            System.out.println(bill.toString());
        }
    }

}