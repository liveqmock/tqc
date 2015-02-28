/**
 * 
 *	平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.dal.model;

/**
 * 
 * @author Jing
 * @version $Id: UserDO.java, v 0.1 2013-7-23 上午9:06:50 Jing Exp $
 */
public class UserDO {

	private Integer userId; //用户Id
	private String userName; //用户名
	private String pwd; //登录密码
	private String mobile; //手机号
	private String email; //邮箱
	private Integer personalId; //员工Id
	
	public UserDO() {
		super();
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPersonalId() {
		return personalId;
	}

	public void setPersonalId(Integer personalId) {
		this.personalId = personalId;
	}

	@Override
	public String toString() {
		return "UserDO [userId=" + userId + ", userName=" + userName + ", pwd="
				+ pwd + ", mobile=" + mobile + ", email=" + email
				+ ", personalId=" + personalId + "]";
	}

}
