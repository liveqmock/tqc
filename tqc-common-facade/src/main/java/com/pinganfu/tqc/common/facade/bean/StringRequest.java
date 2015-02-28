/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.facade.bean;

import java.io.Serializable;

import com.pinganfu.tqc.common.facade.abs.AbstractRequest;

/**
 * 
 * @author Jing
 * @version $Id: StringRequest.java, v 0.1 2013年8月7日 下午8:01:20 Jing Exp $
 */
public class StringRequest extends AbstractRequest implements Serializable {

    private static final long serialVersionUID = 3638923582519494876L;

    private String             requestParam;

    public String getRequestParam() {
        return requestParam;
    }

    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam;
    }

    @Override
    public String toString() {
        return "StringRequest [requestParam=" + requestParam + "]";
    }
    
}
