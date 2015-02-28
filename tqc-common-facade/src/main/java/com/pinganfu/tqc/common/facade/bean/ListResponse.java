/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.facade.bean;

import java.io.Serializable;
import java.util.List;

import com.pinganfu.tqc.common.facade.abs.AbstractResponse;

/**
 * 
 * @author Jing
 * @version $Id: ListResponse.java, v 0.1 2013年8月7日 下午8:04:43 Jing Exp $
 */
public class ListResponse extends AbstractResponse implements Serializable {

    private static final long serialVersionUID = 5692998249269037968L;

    private List<String>       value;

    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

}
