/**
 * 
 *	平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.biz.impl;

import com.pinganfu.common.pagination.Page;
import com.pinganfu.common.pagination.PaginationBean;
import com.pinganfu.tqc.biz.UserBiz;
import com.pinganfu.tqc.service.UserService;
import com.pinganfu.tqc.service.model.User;

/**
 * 
 * @author huanghui
 * @version $Id: UserBizImpl.java, v 0.1 2013-7-23 下午3:05:53 huanghui Exp $
 */
public class UserBizImpl implements UserBiz {

    private UserService userService;

    @Override
    public void addUser(User user) {
        userService.addData(user);
    }

    @Override
    public PaginationBean<User> getUserList(User user, Page page) {
        return userService.getListByPagination(user, page);
    }

    @Override
    public void delUserByPK(Integer pk) {
        User user = new User();
        user.setUserId(pk);
        userService.delDataByPK(user);
    }

    @Override
    public User getUserByPK(Integer pk) {
        return (User) userService.getObjectByPK(pk);
    }

    @Override
    public void modifyUser(User user) {
        userService.modifyDataByPK(user);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User getUser(User user) {
        return userService.getObject(user);
    }

}
