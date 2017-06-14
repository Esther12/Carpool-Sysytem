package com.tongchen.carpool.dao;

import com.tongchen.carpool.entity.Car;
import org.apache.ibatis.annotations.Param;

/**
 * Created by tongchen on 2016-10-06.
 */
public interface CarDao {

    int insertNewCar(Car car);

    int updateCarInfo(Car car);

    int getCarSeatNumByRequestId(@Param("requestId") long requestId);

    Car getMyCar(@Param("userId") long userId);
}
