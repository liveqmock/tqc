/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.integration.converter;

import com.pinganfu.tqc.common.integration.bean.CheckCodeRequestBean;
import com.pinganfu.tqc.common.integration.bean.CheckCodeResponseBean;



/**
 * 
 * @author Jing
 * @version $Id: CheckCodeConverter.java, v 0.1 2013年8月8日 下午2:59:05 Jing Exp $
 */
public class CheckCodeConverter {

    public static CheckCodeRequestBean getRequest(CheckCodeRequestBean reqBean) {
        CheckCodeRequestBean req = new CheckCodeRequestBean();
        req.setId(reqBean.getId());
        req.setSubmitCode(reqBean.getSubmitCode());
        return req;
    }

    public static CheckCodeRequestBean getRequestBean(CheckCodeRequestBean req) {
        CheckCodeRequestBean reqBean = new CheckCodeRequestBean();
        reqBean.setId(req.getId());
        reqBean.setSubmitCode(req.getSubmitCode());
        return reqBean;
    }

    public static CheckCodeResponseBean getResponse(CheckCodeResponseBean rspBean) {
        CheckCodeResponseBean rsp = new CheckCodeResponseBean();
        rsp.setRespCode(rspBean.getRespCode());
        rsp.setValue(rspBean.getValue());
        return rsp;
    }

    public static CheckCodeResponseBean getResponseBean(CheckCodeResponseBean rsp) {
        CheckCodeResponseBean rspBean = new CheckCodeResponseBean();
        rspBean.setRespCode(rsp.getRespCode());
        rspBean.setValue(rsp.getValue());
        return rspBean;
    }

}
