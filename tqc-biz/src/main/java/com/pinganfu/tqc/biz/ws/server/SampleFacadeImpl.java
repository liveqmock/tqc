/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.biz.ws.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pinganfu.common.log.LOG_TYPE;
import com.pinganfu.tqc.common.facade.SampleFacade;
import com.pinganfu.tqc.common.facade.bean.ListRequest;
import com.pinganfu.tqc.common.facade.bean.ListResponse;
import com.pinganfu.tqc.common.facade.bean.SampleRequest;
import com.pinganfu.tqc.common.facade.bean.SampleResponse;
import com.pinganfu.tqc.common.facade.bean.StringRequest;
import com.pinganfu.tqc.common.facade.bean.StringResponse;
import com.pinganfu.tqc.common.facade.code.RspCode;

/**
 * @author zhaobo
 * @version $Id: SampleWebServiceImpl.java, v 0.1 2013-7-23 下午12:55:09 DELL Exp $
 */
public class SampleFacadeImpl implements SampleFacade {

    private Logger logger = LoggerFactory.getLogger(LOG_TYPE.PAFF_COMMON.val);

    @Override
    public StringResponse wsSampleString(StringRequest req) {
        StringResponse rsp = new StringResponse();
        try {
            rsp.setValue(req + RspCode.SUCCESS.getName());
            rsp.setRespCode(RspCode.SUCCESS.getCode());
        } catch (Exception e) {
            logger.error("wsSampleString", e);
            logger.error("Input value", req.toString());
            rsp.setRespCode(RspCode.ERROR.getCode());
            return rsp;
        }
        return rsp;
    }

    @Override
    public ListResponse wsSampleStrings(ListRequest req) {
        ListResponse rsp = new ListResponse();
        try {
            for (int i = 0; i < req.getParam().size(); i++) {
                req.getParam().set(i, req.getParam().get(i) + RspCode.SUCCESS.getName());
            }
            rsp.setValue(req.getParam());
            rsp.setRespCode(RspCode.SUCCESS.getCode());
        } catch (Exception e) {
            logger.error("wsSampleStrings", e);
            logger.error("Input value", req.toString());
            rsp.setRespCode(RspCode.ERROR.getCode());
            return rsp;
        }
        return rsp;
    }

    @Override
    public SampleResponse wsSampleObject(SampleRequest req) {
        SampleResponse rsp = new SampleResponse();
        try {
            rsp.setAddress(req.getAddress());
            rsp.setId(req.getId());
            rsp.setPassword(req.getPassword());
            rsp.setUsername(req.getUsername());
            rsp.setRespCode(RspCode.SUCCESS.getCode());
        } catch (Exception e) {
            logger.error("wsSampleObject", e);
            logger.error("Input value", req.toString());
            rsp.setRespCode(RspCode.ERROR.getCode());
            return rsp;
        }
        return rsp;
    }

}
