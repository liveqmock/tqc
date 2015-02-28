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
 * @version $Id: CheckCodeResponseBean.java, v 0.1 2013年8月8日 下午12:54:56 Jing Exp $
 */
public class CheckCodeResponseBean extends AbstractResponseClient {

    private static final long serialVersionUID = -275165579528999028L;
    
    public String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString() + " CheckCodeResponseBean [value=" + value + "]";
    }

}
