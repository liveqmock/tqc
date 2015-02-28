/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.integration.bean;

import java.util.List;

import com.pinganfu.tqc.common.integration.abs.AbstractResponseClient;

/**
 * 
 * @author Jing
 * @version $Id: StringClient.java, v 0.1 2013年8月7日 下午8:34:42 Jing Exp $
 */
public class ListResponseBean extends AbstractResponseClient {

    private static final long serialVersionUID = -308545591582307730L;

    public List<String>       list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
