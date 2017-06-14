package com.tongchen.carpool.dao;

import com.tongchen.carpool.entity.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by tongchen on 2016-10-06.
 */

public interface BillDao {

    int insertBillInfo(@Param("userId") long userId,@Param("requestId") long requestId);

    int cancelBill(@Param("billId") long billId);

    List<Bill> getMyBill(@Param("userId") long userId);

    int successBill(@Param("billId") long billId);

    int checkBillNumFromSameRequest(@Param("requestId") long requestId);
}
