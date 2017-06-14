package com.tongchen.carpool.service.impl;

import com.tongchen.carpool.dao.BillDao;
import com.tongchen.carpool.dao.CarDao;
import com.tongchen.carpool.dao.RequestDao;
import com.tongchen.carpool.entity.Bill;
import com.tongchen.carpool.exception.BillException;
import com.tongchen.carpool.exception.RequestCloseException;
import com.tongchen.carpool.exception.ScheduleManyOnceException;
import com.tongchen.carpool.service.BillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by tongchen on 2016-10-19.
 */
@Service
public class BillServiceImpl implements BillService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BillDao billDao;

    @Autowired
    RequestDao requestDao;

    @Autowired
    CarDao carDao;

    public List<Bill> getMyBill(long userId) {
        return billDao.getMyBill(userId);
    }

    public boolean successBill(long billId) {
        return billDao.successBill(billId) > 0;
    }

    @Transactional
    public boolean cancelBill(long billId) {
        if (billDao.cancelBill(billId) > 0){
            if (requestDao.renewRequest(billId)>0){
                return true;
            }else
                return false;
        }else
            return false;
    }

    @Transactional
    public boolean generateBill(int scheduledTimes, long userId, long requestId) throws BillException, RequestCloseException {
        try {
            if (billDao.checkBillNumFromSameRequest(requestId) + scheduledTimes <= carDao.getCarSeatNumByRequestId(requestId)) {
                for(int i=0;i<scheduledTimes;i++) {
                    if (billDao.insertBillInfo(userId, requestId) > 0) {
                        if (i==scheduledTimes-1) {
                            if (billDao.checkBillNumFromSameRequest(requestId) == carDao.getCarSeatNumByRequestId(requestId)) {
                                requestDao.fullRequest(requestId);
                                break;
                            }
                        }else {
                            continue;
                        }
                    } else {
                        throw new RequestCloseException("This request is closed");
                    }
                }
                return true;
            } else {
                throw new ScheduleManyOnceException("没有足够的位置了");
            }
        } catch (RequestCloseException e1) {
            throw e1;
        }catch (ScheduleManyOnceException e2) {
            throw e2;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new BillException("Bill inner error" + e.getMessage());
        }
    }
}
