/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.integration.converter;

import com.pinganfu.tqc.common.facade.bean.StringRequest;
import com.pinganfu.tqc.common.facade.bean.StringResponse;
import com.pinganfu.tqc.common.integration.bean.StringRequestBean;
import com.pinganfu.tqc.common.integration.bean.StringResponseBean;

/**
 * 转换类
 * @author Jing
 * @version $Id: SampleWSConverter.java, v 0.1 2013年8月8日 上午8:49:34 Jing Exp $
 */
public class StringWSConverter {

    public static StringRequest getRequest(StringRequestBean reqBean) {
        StringRequest req = new StringRequest();
        req.setRequestParam(reqBean.getValue());
        return req;
    }

    public static StringRequestBean getRequestBean(StringRequest req) {
        StringRequestBean reqBean = new StringRequestBean();
        reqBean.setValue(req.getRequestParam());
        return reqBean;
    }

    public static StringResponse getResponse(StringResponseBean rspBean) {
        StringResponse rsp = new StringResponse();
        rsp.setRespCode(rspBean.getRespCode());
        rsp.setValue(rspBean.getValue());
        return rsp;
    }

    public static StringResponseBean getResponseBean(StringResponse rsp) {
        StringResponseBean rspBean = new StringResponseBean();
        rspBean.setRespCode(rsp.getRespCode());
        rspBean.setValue(rsp.getValue());
        return rspBean;
    }

}
