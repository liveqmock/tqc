/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.integration.ws.impl;

import com.pinganfu.tqc.common.facade.SampleFacade;
import com.pinganfu.tqc.common.facade.bean.ListRequest;
import com.pinganfu.tqc.common.facade.bean.ListResponse;
import com.pinganfu.tqc.common.facade.bean.SampleRequest;
import com.pinganfu.tqc.common.facade.bean.SampleResponse;
import com.pinganfu.tqc.common.facade.bean.StringRequest;
import com.pinganfu.tqc.common.facade.bean.StringResponse;
import com.pinganfu.tqc.common.integration.bean.ListRequestBean;
import com.pinganfu.tqc.common.integration.bean.ListResponseBean;
import com.pinganfu.tqc.common.integration.bean.SampleRequestBean;
import com.pinganfu.tqc.common.integration.bean.SampleResponseBean;
import com.pinganfu.tqc.common.integration.bean.StringRequestBean;
import com.pinganfu.tqc.common.integration.bean.StringResponseBean;
import com.pinganfu.tqc.common.integration.converter.ListWSConverter;
import com.pinganfu.tqc.common.integration.converter.SampleWSConverter;
import com.pinganfu.tqc.common.integration.converter.StringWSConverter;
import com.pinganfu.tqc.common.integration.ws.SampleFacadeClient;
//import com.pinganfu.runtime.ws.BaseWSClient;

public class SampleFacadeClientImp{}
/**
 * 
 * @author Jing
 * @version $Id: SampleWSClientImpl.java, v 0.1 2013年8月7日 下午8:35:18 Jing Exp $
 */
/*public class SampleFacadeClientImpl extends BaseWSClient<SampleFacade> implements SampleFacadeClient {

    @Override
    public StringResponseBean getString(StringRequestBean reqBean) {
        StringRequest req = StringWSConverter.getRequest(reqBean);
        StringResponse rsp = getAppointRemoteBean().wsSampleString(req);
        StringResponseBean rspBean = StringWSConverter.getResponseBean(rsp);
        return rspBean;
    }

    @Override
    public ListResponseBean getStrings(ListRequestBean reqBean) {
        ListRequest req = ListWSConverter.getRequest(reqBean);
        ListResponse rsp = getAppointRemoteBean().wsSampleStrings(req);
        ListResponseBean rspBean = ListWSConverter.getResponseBean(rsp);
        return rspBean;
    }

    @Override
    public SampleResponseBean getObj(SampleRequestBean reqBean) {
        SampleRequest req = SampleWSConverter.getRequest(reqBean);
        SampleResponse rsp = getAppointRemoteBean().wsSampleObject(req);
        SampleResponseBean rspBean = SampleWSConverter.getResponseBean(rsp);
        return rspBean;
    }

}*/
