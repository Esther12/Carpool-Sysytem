package com.tongchen.carpool.dao;

import com.tongchen.carpool.entity.Car;
import com.tongchen.carpool.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by tongchen on 2016-10-09.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class CarDaoTest {
    @Resource
    private CarDao carDao;
    private Car car = new Car();
    private User user = new User();
    @Test
    public void updateCarInfo() throws Exception {
        car.setCarLicense("333");
        car.setCarId(1000L);
        car.setCarSeatNum(1);
        car.setCarType("abc");
        //user.setUserId(1000L);
        //car.setUser(user);
        carDao.updateCarInfo(car);
    }

    @Test
    public void getCarSeatNum() throws Exception {
        int i=carDao.getCarSeatNumByRequestId(1002L);
        System.out.println(i);
    }

    @Test
    public void getMyCar() throws Exception {
        car=carDao.getMyCar(1000L);
        System.out.println(car.toString());
    }


    @Test
    public void insertNewCar() throws Exception {
        car.setCarLicense("adfadf");
        car.setCarSeatNum(7);
        car.setCarType("akjsdhfjk");
        user.setUserId(1000L);
        car.setUser(user);
        carDao.insertNewCar(car);
    }


}