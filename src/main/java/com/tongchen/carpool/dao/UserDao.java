package com.tongchen.carpool.dao;

import com.tongchen.carpool.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by tongchen on 2016-10-06.
 */
public interface UserDao {
    /**
     *
     * @param userName
     * @param userTele
     * @param userIdentity
     * @return
     * int 返回为0 表示插入失败，为1表示插入成功
     */
    int insertUserInfo(@Param("userName") String userName, @Param("userPassword") String userPassword, @Param("userTele") long userTele,@Param("userIdentity") int userIdentity);

    int checkUser(@Param("userName") String userName,@Param("userTele") long userTele);

    User userLogin(@Param("userName") String userName, @Param("userPassword") String userPassword);
}
