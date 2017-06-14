package com.tongchen.carpool.service.impl;


import com.tongchen.carpool.dao.CarDao;
import com.tongchen.carpool.entity.Car;
import com.tongchen.carpool.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tongchen on 2016-10-16.
 */
@Service
public class CarServiceImpl implements CarService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CarDao carDao;

    public boolean insertNewCar(Car car) {
        if (carDao.insertNewCar(car) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateCarInfo(Car car) {
        if (carDao.updateCarInfo(car) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Car getMyCar(long userId) {
        return carDao.getMyCar(userId);
    }
}
