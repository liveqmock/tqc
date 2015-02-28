/**
 * 
 *	平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.integration.ws;

/**
 * 
 * @author huanghui
 * @version $Id: CaptchaCenterWSClient.java, v 0.1 2013-7-25 下午4:26:52 huanghui Exp $
 */
public interface CaptCenterFacadeClient {

    /**
     * 验证校验码
     */
    public String checkCaptcha(String id,String submit);
}
