/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.integration.ws;

import com.pinganfu.tqc.common.integration.bean.ListRequestBean;
import com.pinganfu.tqc.common.integration.bean.ListResponseBean;
import com.pinganfu.tqc.common.integration.bean.SampleRequestBean;
import com.pinganfu.tqc.common.integration.bean.SampleResponseBean;
import com.pinganfu.tqc.common.integration.bean.StringRequestBean;
import com.pinganfu.tqc.common.integration.bean.StringResponseBean;

/**
 * 
 * @author Jing
 * @version $Id: SampleWSClient.java, v 0.1 2013年8月7日 下午8:27:35 Jing Exp $
 */
public interface SampleFacadeClient {

    public StringResponseBean getString(StringRequestBean req);

    public ListResponseBean getStrings(ListRequestBean req);

    public SampleResponseBean getObj(SampleRequestBean req);

}