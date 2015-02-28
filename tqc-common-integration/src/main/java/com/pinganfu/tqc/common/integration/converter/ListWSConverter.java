/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.integration.converter;

import com.pinganfu.tqc.common.facade.bean.ListRequest;
import com.pinganfu.tqc.common.facade.bean.ListResponse;
import com.pinganfu.tqc.common.integration.bean.ListRequestBean;
import com.pinganfu.tqc.common.integration.bean.ListResponseBean;

/**
 * 转换类
 * @author Jing
 * @version $Id: ListWSConverter.java, v 0.1 2013年8月8日 上午8:49:34 Jing Exp $
 */
public class ListWSConverter {

    public static ListRequest getRequest(ListRequestBean reqBean) {
        ListRequest req = new ListRequest();
        req.setParam(reqBean.getList());
        return req;
    }

    public static ListRequestBean getRequestBean(ListRequest req) {
        ListRequestBean reqBean = new ListRequestBean();
        reqBean.setList(req.getParam());
        return reqBean;
    }

    public static ListResponse getResponse(ListResponseBean rspBean) {
        ListResponse rsp = new ListResponse();
        rsp.setRespCode(rspBean.getRespCode());
        rsp.setValue(rspBean.getList());
        return rsp;
    }

    public static ListResponseBean getResponseBean(ListResponse rsp) {
        ListResponseBean rspBean = new ListResponseBean();
        rspBean.setRespCode(rsp.getRespCode());
        rspBean.setList(rsp.getValue());
        return rspBean;
    }

}
