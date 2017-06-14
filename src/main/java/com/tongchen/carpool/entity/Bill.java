package com.tongchen.carpool.entity;

import java.util.Date;

/**
 * Created by tongchen on 2016-10-06.
 */
public class Bill {

    private long billId;

    private Request request;

    private User user;

    private Date createTime;

    public long getBillId() {
        return billId;
    }

    public void setBillId(long billId) {
        this.billId = billId;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", request=" + request +
                ", user=" + user +
                ", createTime=" + createTime +
                '}';
    }
}
