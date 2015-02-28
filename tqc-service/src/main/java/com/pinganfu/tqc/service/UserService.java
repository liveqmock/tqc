/**
 * 
 *	平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.service;

import java.util.List;

import com.pinganfu.common.pagination.Page;
import com.pinganfu.common.pagination.PaginationBean;
import com.pinganfu.tqc.service.model.User;

/**
 * 
 * @author Jing
 * @version $Id: UserService.java, v 0.1 2013-7-23 上午9:08:00 Jing Exp $
 */
public interface UserService {

    public Integer addData(final User user);

    public int delData(final User user);

    public int delDataByPK(final User user);

    public int modifyData(final User user);

    public int modifyDataByPK(final User user);

    public int getInt(User user);

    public List<User> getList(User user);

    public List<User> getAllList();

    public User getObject(User user);

    public User getObjectByPK(Object pk);

    public PaginationBean<User> getListByPagination(User user, Page page);
    
}
