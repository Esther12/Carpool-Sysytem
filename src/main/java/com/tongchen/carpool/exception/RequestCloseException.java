package com.tongchen.carpool.exception;

/**
 * Created by tongchen on 2016-10-20.
 */
public class RequestCloseException extends BillException {
    public RequestCloseException(String message) {
        super(message);
    }

    public RequestCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
