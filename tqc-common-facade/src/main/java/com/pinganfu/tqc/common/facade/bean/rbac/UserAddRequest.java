package com.pinganfu.tqc.common.facade.bean.rbac;

import java.io.Serializable;

import com.pinganfu.tqc.common.facade.abs.AbstractRequest;

/**
 * 添加用户
 * @author yanjiawei 2015.01.15
 *
 */
public class UserAddRequest extends AbstractRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -239928680828626866L;

	private String userName; // 用户名
	private String pwd; // 登陆密码
	private String email; // 邮箱
	private String mobile; // 手机号

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
