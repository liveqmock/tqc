/**
 * 
 *	平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.biz;

import com.pinganfu.common.pagination.Page;
import com.pinganfu.common.pagination.PaginationBean;
import com.pinganfu.tqc.service.model.User;

/**
 * 
 * @author huanghui
 * @version $Id: UserBiz.java, v 0.1 2013-7-23 下午3:04:52 huanghui Exp $
 */
public interface UserBiz {

    public void addUser(User user);

    public void delUserByPK(Integer pk);

    public User getUserByPK(Integer pk);

    public void modifyUser(User user);

    public PaginationBean<User> getUserList(User user, Page page);
    
    public User getUser(User user);
}
