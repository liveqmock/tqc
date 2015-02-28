/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.facade;

import javax.jws.WebService;

import com.pinganfu.tqc.common.facade.bean.ListRequest;
import com.pinganfu.tqc.common.facade.bean.ListResponse;
import com.pinganfu.tqc.common.facade.bean.SampleRequest;
import com.pinganfu.tqc.common.facade.bean.SampleResponse;
import com.pinganfu.tqc.common.facade.bean.StringRequest;
import com.pinganfu.tqc.common.facade.bean.StringResponse;

/**
 * @author zhaobo
 * @version $Id: SampleWebService.java, v 0.1 2013-7-23 上午11:08:10 DELL Exp $
 */
@WebService
public interface SampleFacade {
    /*
     * 发送字符串请求
     */
    public StringResponse wsSampleString(StringRequest str);

    /*
     * 发送字符串List  
     */
    public ListResponse wsSampleStrings(ListRequest list);

    /*
     * 传递对象 
     */
    public SampleResponse wsSampleObject(SampleRequest obj);

}
