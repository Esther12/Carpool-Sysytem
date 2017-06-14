package com.tongchen.carpool.entity;

import java.util.Date;

/**
 * Created by tongchen on 2016-10-06.
 */
public class Request {

    private long requestId;

    private String beginPlace;

    private String endPlace;

    private int price;

    private Date beginTime;

    private Date createTime;

    private User user;

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public String getBeginPlace() {
        return beginPlace;
    }

    public void setBeginPlace(String beginPlace) {
        this.beginPlace = beginPlace;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestId=" + requestId +
                ", beginPlace='" + beginPlace + '\'' +
                ", endPlace='" + endPlace + '\'' +
                ", price=" + price +
                ", beginTime=" + beginTime +
                ", createTime=" + createTime +
                ", user=" + user +
                ", car=" + car +
                '}';
    }
}
