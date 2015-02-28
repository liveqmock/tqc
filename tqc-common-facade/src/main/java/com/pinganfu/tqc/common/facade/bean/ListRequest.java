/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.facade.bean;

import java.io.Serializable;
import java.util.List;

import com.pinganfu.tqc.common.facade.abs.AbstractRequest;

/**
 * 
 * @author Jing
 * @version $Id: ListRequest.java, v 0.1 2013年8月7日 下午8:04:06 Jing Exp $
 */
public class ListRequest extends AbstractRequest implements Serializable {

    private static final long serialVersionUID = 2476662680871214512L;

    private List<String>       param;

    public List<String> getParam() {
        return param;
    }

    public void setParam(List<String> param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return "ListRequest [param=" + param + "]";
    }

}
