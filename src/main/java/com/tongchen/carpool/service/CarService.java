package com.tongchen.carpool.service;

import com.tongchen.carpool.entity.Car;

/**
 * Created by tongchen on 2016-10-15.
 */
public interface CarService {

    boolean insertNewCar(Car car);

    boolean updateCarInfo(Car car);

    Car getMyCar(long userId);
}
