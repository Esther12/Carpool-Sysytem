package com.tongchen.carpool.service.impl;

import com.tongchen.carpool.dao.RequestDao;
import com.tongchen.carpool.entity.Request;
import com.tongchen.carpool.service.RequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by tongchen on 2016-10-19.
 */
@Service
public class RequestServiceImpl implements RequestService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RequestDao requestDao;

    public List<Request> getRequestList(int userIndentity) {
        /* Driver */
        if (userIndentity==0) {
            return requestDao.getRequestOfDriver();
        }
        /* Passenger */
        else if (userIndentity==1){
            return requestDao.getRequestOfPassenger();
        }else
            return null;
    }

    public boolean insertNewRequest(Request request) {
        if (requestDao.insertNewRequest(request)>0)
            return true;
        else
            return false;
    }

    public List<Request> getMyRequest(long userId) {
        return requestDao.getMyRequest(userId);
    }

    public boolean cancelRequest(long requestId) {
        if (requestDao.cancelRequest(requestId)>0)
            return true;
        else
            return false;
    }

    public Request getRequestById(long requestId) {
        return requestDao.getRequestById(requestId);
    }
}
