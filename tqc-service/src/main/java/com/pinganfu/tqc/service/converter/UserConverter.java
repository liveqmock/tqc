/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.service.converter;

import java.util.ArrayList;
import java.util.List;

import com.pinganfu.tqc.common.dal.model.UserDO;
import com.pinganfu.tqc.service.model.User;

/**
 * 工具转换类
 * @author Jing
 * @version $Id: UserConverter.java, v 0.1 2013年8月7日 下午5:00:59 Jing Exp $
 */
public class UserConverter {

    /**
     * UserDO==>User 
     */
    public static User getUser(UserDO userDO) {
        if (userDO == null) {
            return null;
        }
        User user = new User();
        user.setUserId(userDO.getUserId());
        user.setUserName(userDO.getUserName());
        return user;
    }

    /**
     * User==>UserDO
     */
    public static UserDO getUserDO(User user) {
        if (user == null) {
            return null;
        }
        UserDO userDO = new UserDO();
        userDO.setUserId(user.getUserId());
        userDO.setUserName(user.getUserName());
        return userDO;
    }

    /**
     * UserDOs==>Users
     */
    public static List<User> getUserList(List<UserDO> doList) {
        if (doList == null) {
            return null;
        }
        List<User> list = new ArrayList<User>();
        for (UserDO userDO : doList) {
            list.add(getUser(userDO));
        }
        return list;
    }

    /**
     * Users==>UserDOs
     */
    public static List<UserDO> getUserDOList(List<User> list) {
        if (list == null) {
            return null;
        }
        List<UserDO> doList = new ArrayList<UserDO>();
        for (User user : list) {
            doList.add(getUserDO(user));
        }
        return doList;
    }

}
