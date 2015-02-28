package com.pinganfu.tqc.common.dal.model.rbac;

public class CommonUserDO {
	private Integer id;
	private String username;
	private String password;
	private Integer status;
	private String remark;
	private Integer lastLoginTime;
	private String lastLoginIp;
	private String lastLocation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Integer lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getLastLocation() {
		return lastLocation;
	}

	public void setLastLocation(String lastLocation) {
		this.lastLocation = lastLocation;
	}

	@Override
	public String toString() {
		return "CommonUserDO [id=" + id + ", username=" + username
				+ ", password=" + password + ", status=" + status + ", remark="
				+ remark + ", lastLoginTime=" + lastLoginTime
				+ ", lastLoginIp=" + lastLoginIp + ", lastLocation="
				+ lastLocation + "]";
	}
	
}