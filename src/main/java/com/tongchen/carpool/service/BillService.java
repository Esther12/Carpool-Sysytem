package com.tongchen.carpool.service;

import com.tongchen.carpool.entity.Bill;
import com.tongchen.carpool.exception.BillException;
import com.tongchen.carpool.exception.RequestCloseException;

import java.util.List;

/**
 * Created by tongchen on 2016-10-15.
 */
public interface BillService {

    List<Bill> getMyBill(long userId);

    boolean successBill(long billId);

    boolean cancelBill(long billId);

    boolean generateBill(int scheduledTimes, long userId,long requestId) throws BillException,RequestCloseException;
}
