package com.tongchen.carpool.tool;

import org.springframework.util.DigestUtils;

/**
 * Created by tongchen on 2016-10-20.
 */
public class PasswordGenerator {
    public static String getMD5Password(String password){
        final String salt="jalsd*&^(jkl;akjdfzcx,vm/opi";
        String base = password+"/"+salt;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }
}
