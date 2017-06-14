package com.tongchen.carpool.entity;

/**
 * Created by tongchen on 2016-10-06.
 */
public class Car {

    private long carId;

    private String carLicense;

    private String carType;

    private int carSeatNum;

    private User user;

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getCarLicense() {
        return carLicense;
    }

    public void setCarLicense(String carLicense) {
        this.carLicense = carLicense;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getCarSeatNum() {
        return carSeatNum;
    }

    public void setCarSeatNum(int carSeatNum) {
        this.carSeatNum = carSeatNum;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carLicense='" + carLicense + '\'' +
                ", carType='" + carType + '\'' +
                ", carSeatNum=" + carSeatNum +
                ", user=" + user +
                '}';
    }
}
