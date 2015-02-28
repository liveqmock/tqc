/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.integration.converter;

import com.pinganfu.tqc.common.facade.bean.SampleRequest;
import com.pinganfu.tqc.common.facade.bean.SampleResponse;
import com.pinganfu.tqc.common.integration.bean.SampleRequestBean;
import com.pinganfu.tqc.common.integration.bean.SampleResponseBean;

/**
 * 转换类
 * @author Jing
 * @version $Id: SampleWSConverter.java, v 0.1 2013年8月8日 上午8:49:34 Jing Exp $
 */
public class SampleWSConverter {

    public static SampleRequest getRequest(SampleRequestBean reqBean) {
        SampleRequest req = new SampleRequest();
        req.setAddress(reqBean.getAddress());
        req.setId(reqBean.getId());
        req.setPassword(reqBean.getPassword());
        req.setUsername(reqBean.getUsername());
        return req;
    }

    public static SampleRequestBean getRequestBean(SampleRequest req) {
        SampleRequestBean reqBean = new SampleRequestBean();
        reqBean.setAddress(req.getAddress());
        reqBean.setId(req.getId());
        reqBean.setPassword(req.getPassword());
        reqBean.setUsername(req.getUsername());
        return reqBean;
    }

    public static SampleResponse getResponse(SampleResponseBean rspBean) {
        SampleResponse rsp = new SampleResponse();
        rsp.setAddress(rspBean.getAddress());
        rsp.setId(rspBean.getId());
        rsp.setPassword(rspBean.getPassword());
        rsp.setRespCode(rspBean.getRespCode());
        rsp.setUsername(rspBean.getUsername());
        return rsp;
    }

    public static SampleResponseBean getResponseBean(SampleResponse rsp) {
        SampleResponseBean rspBean = new SampleResponseBean();
        rspBean.setAddress(rsp.getAddress());
        rspBean.setId(rsp.getId());
        rspBean.setPassword(rsp.getPassword());
        rspBean.setRespCode(rsp.getRespCode());
        rspBean.setUsername(rsp.getUsername());
        return rspBean;
    }

}
