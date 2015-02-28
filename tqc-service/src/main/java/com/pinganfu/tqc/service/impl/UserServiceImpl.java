/**
 * 
 *	平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.service.impl;

import java.util.List;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.pinganfu.common.pagination.Page;
import com.pinganfu.common.pagination.PaginationBean;
import com.pinganfu.tqc.common.dal.dao.UserDao;
import com.pinganfu.tqc.common.dal.model.UserDO;
import com.pinganfu.tqc.service.UserService;
import com.pinganfu.tqc.service.converter.UserConverter;
import com.pinganfu.tqc.service.model.User;

/**
 * 
 * @author Jing
 * @version $Id: UserServiceImpl.java, v 0.1 2013-7-23 上午9:08:21 Jing Exp $
 */
public class UserServiceImpl implements UserService {

    private UserDao             userDao;
    private TransactionTemplate transactionTemplate;

    public Integer addData(final User user) {
        return transactionTemplate.execute(new TransactionCallback<Integer>() {
            @Override
            public Integer doInTransaction(TransactionStatus status) {
            	//return userDao.insertData(UserConverter.getUserDO(user));
                UserDO userDo = UserConverter.getUserDO(user);
                int rs = userDao.insertData(userDo);
                user.setUserId(userDo.getUserId());
                return rs;
            }
        });
    }

    public int delData(final User user) {
        return transactionTemplate.execute(new TransactionCallback<Integer>() {
            @Override
            public Integer doInTransaction(TransactionStatus status) {
                return userDao.deleteData(UserConverter.getUserDO(user));
            }

        });
    }

    public int delDataByPK(final User user) {
        return transactionTemplate.execute(new TransactionCallback<Integer>() {
            @Override
            public Integer doInTransaction(TransactionStatus status) {
                return userDao.deleteDataByPK(UserConverter.getUserDO(user));
            }
        });
    }

    public int modifyData(final User user) {
        return transactionTemplate.execute(new TransactionCallback<Integer>() {
            @Override
            public Integer doInTransaction(TransactionStatus status) {
                return userDao.updateData(UserConverter.getUserDO(user));
            }

        });
    }

    public int modifyDataByPK(final User user) {
        return transactionTemplate.execute(new TransactionCallback<Integer>() {
            @Override
            public Integer doInTransaction(TransactionStatus status) {
                return userDao.updateDataByPK(UserConverter.getUserDO(user));
            }

        });
    }

    public int getInt(User user) {
        return userDao.queryForInt(UserConverter.getUserDO(user));
    }

    public List<User> getList(User user) {
        List<UserDO> userDOList = userDao.queryForList(UserConverter.getUserDO(user));
        return UserConverter.getUserList(userDOList);
    }

    public List<User> getAllList() {
        List<UserDO> userDOList = userDao.queryForListAll();
        return UserConverter.getUserList(userDOList);
    }

    public User getObject(User user) {
        UserDO param = UserConverter.getUserDO(user);
        UserDO rsUserDO = userDao.queryObject(param);
        return UserConverter.getUser(rsUserDO);
    }

    public User getObjectByPK(Object pk) {
        UserDO userDO = (UserDO) userDao.queryObjectByPK(pk);
        return UserConverter.getUser(userDO);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public PaginationBean getListByPagination(User user, Page page) {
        UserDO userDO = UserConverter.getUserDO(user);
        PaginationBean paginationBean = userDao.queryForListByPagination(userDO, page);
        
        paginationBean.setPageList(UserConverter.getUserList(paginationBean.getPageList()));
        
        return paginationBean;
        //return UserConverter.getUserList(paginationBean.getPageList());
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

}
