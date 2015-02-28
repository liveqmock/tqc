/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.integration.bean;

import com.pinganfu.tqc.common.integration.abs.AbstractResponseClient;

/**
 * 
 * @author Jing
 * @version $Id: StringClient.java, v 0.1 2013年8月7日 下午8:34:42 Jing Exp $
 */
public class StringResponseBean extends AbstractResponseClient {

    private static final long serialVersionUID = 1L;

    public String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
