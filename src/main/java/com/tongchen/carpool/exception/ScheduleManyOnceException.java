package com.tongchen.carpool.exception;

/**
 * Created by tongchen on 2016-10-21.
 */
public class ScheduleManyOnceException extends BillException {
    public ScheduleManyOnceException(String message) {
        super(message);
    }

    public ScheduleManyOnceException(String message, Throwable cause) {
        super(message, cause);
    }
}
