/**
 * 
 *	平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.integration.abs;

import java.io.Serializable;

/**
 * 
 * @author Jing
 * @version $Id: AbstractResponse.java, v 0.1 2013年8月7日 下午7:54:36 Jing Exp $
 */
public abstract class AbstractResponseClient implements Serializable {

    private static final long serialVersionUID = 5534594833343866597L;

    /** 系统返回码 */
    private String            respCode;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    @Override
    public String toString() {
        return "AbstractResponseClient [respCode=" + respCode + "]";
    }

}
