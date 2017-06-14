package com.tongchen.carpool.enums;

/**
 * Created by tongchen on 2016-10-16.
 */
public enum CarpoolStatEnum {
    SUCCESS(1,"Success"),
    END(0,"End"),
    SEAT_NOT_ENOUGH(-1,"Seat Is Not Enough"),
    REQUEST_CLOSED(-2,"Request is closed"),
    DATA_REWRITE(-3,"Data Rewrite"),
    INNER_ERROR(-4,"System Error");

    private int state;
    private  String stateInfo;

    CarpoolStatEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static CarpoolStatEnum stateOf(int index){
        for(CarpoolStatEnum state: values()){
            if (state.getState() == index){
                return state;
            }
        }
        return null;
    }
}
