/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.facade.bean;

import java.io.Serializable;

import com.pinganfu.tqc.common.facade.abs.AbstractResponse;

/**
 * 
 * @author Jing
 * @version $Id: StringResponse.java, v 0.1 2013年8月7日 下午8:02:44 Jing Exp $
 */
public class StringResponse extends AbstractResponse implements Serializable {

    private static final long serialVersionUID = 1772582788718309621L;

    private String             value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
