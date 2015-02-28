/**
 * 
 *	平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.service.model;

/**
 * 
 * @author Jing
 * @version $Id: User.java, v 0.1 2013年8月7日 下午4:55:31 Jing Exp $
 */
public class User {

    public Integer   userId;

    public String userName;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}

}
