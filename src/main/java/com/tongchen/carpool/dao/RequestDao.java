package com.tongchen.carpool.dao;

import com.tongchen.carpool.entity.Request;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by tongchen on 2016-10-06.
 */
public interface RequestDao {

    int insertNewRequest(Request request);

    List<Request> getRequestOfDriver();

    List<Request> getRequestOfPassenger();

    List<Request> getMyRequest(@Param("userId") long userId);

    Request getRequestById(@Param("requestId") long requestId);

    int fullRequest(@Param("requestId") long requestId);

    int cancelRequest(@Param("requestId") long requestId);

    int renewRequest(@Param("billId") long billId);
}
