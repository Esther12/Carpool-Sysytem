package com.tongchen.carpool.exception;

/**
 * Created by tongchen on 2016-10-21.
 */
public class BillException extends RuntimeException {
    public BillException(String message) {
        super(message);
    }

    public BillException(String message, Throwable cause) {
        super(message, cause);
    }
}
