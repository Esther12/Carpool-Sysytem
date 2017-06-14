package com.tongchen.carpool.service;

import com.tongchen.carpool.entity.Request;

import java.util.List;

/**
 * Created by tongchen on 2016-10-15.
 */
public interface RequestService {

    List<Request> getRequestList(int userIndentity);

    boolean insertNewRequest(Request request);

    List<Request> getMyRequest(long userId);

    boolean cancelRequest(long requestId);

    Request getRequestById(long requestId);
}
