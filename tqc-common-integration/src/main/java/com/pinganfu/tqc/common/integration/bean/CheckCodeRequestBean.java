/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.integration.bean;

/**
 * 
 * @author Jing
 * @version $Id: CheckCodeRequestBean.java, v 0.1 2013年8月8日 下午12:54:59 Jing Exp $
 */
public class CheckCodeRequestBean {

    private String id;
    private String submitCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubmitCode() {
        return submitCode;
    }

    public void setSubmitCode(String submitCode) {
        this.submitCode = submitCode;
    }

    @Override
    public String toString() {
        return "CheckCodeRequestBean [id=" + id + ", submitCode=" + submitCode + "]";
    }

}
