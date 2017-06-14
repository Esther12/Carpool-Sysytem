package com.tongchen.carpool.entity;

import java.util.Date;

/**
 * Created by tongchen on 2016-10-04.
 */
public class User {

    private long userId;

    private String userName;

    private String userPassword;

    private long userTele;

    private int userIdentity;

    private Date createTime;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserTele() {
        return userTele;
    }

    public void setUserTele(long userTele) {
        this.userTele = userTele;
    }

    public int getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(int userIdentity) {
        this.userIdentity = userIdentity;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userTele=" + userTele +
                ", userIdentity=" + userIdentity +
                ", createTime=" + createTime +
                '}';
    }
}
