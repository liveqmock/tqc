/**
 * 
 *	平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.facade.abs;

import java.io.Serializable;

/**
 * 
 * @author Jing
 * @version $Id: AbstractResponse.java, v 0.1 2013年8月7日 下午7:54:36 Jing Exp $
 */
public abstract class AbstractResponse implements Serializable {

	private static final long serialVersionUID = 5534594833343866897L;
	/** 系统返回码 */
	private String respCode;
	private String memo;

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
