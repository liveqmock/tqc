/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pinganfu.common.log.LOG_TYPE;
import com.pinganfu.tqc.common.facade.SampleFacade;
import com.pinganfu.tqc.common.facade.bean.StringRequest;
import com.pinganfu.tqc.common.facade.code.RspCode;
import com.pinganfu.tqc.common.integration.bean.ListRequestBean;
import com.pinganfu.tqc.common.integration.bean.ListResponseBean;
import com.pinganfu.tqc.common.integration.bean.SampleRequestBean;
import com.pinganfu.tqc.common.integration.bean.SampleResponseBean;
import com.pinganfu.tqc.common.integration.bean.StringRequestBean;
import com.pinganfu.tqc.common.integration.bean.StringResponseBean;
import com.pinganfu.tqc.common.integration.ws.SampleFacadeClient;

/**
 * 
 * @author Jing
 * @version $Id: WsSampleClientController.java, v 0.1 2013年8月8日 上午10:25:32 Jing Exp $
 */
@Controller
@RequestMapping("/ws")
public class WsSampleClientController {

    private Logger             logger = LoggerFactory.getLogger(LOG_TYPE.PAFF_COMMON.val);

//    @Autowired
    private SampleFacadeClient sampleFacadeClient;

    @RequestMapping("/index")
    public String showIndexWs() {
        return "ws/index_ws";
    }

    @RequestMapping("/wsSampleString")
    public ModelAndView wsSampleString() {
        ModelAndView mav = new ModelAndView("welcome");
        StringRequestBean reqBean = new StringRequestBean();
        reqBean.setValue("String ==> PAFF");
        StringResponseBean rspBean = sampleFacadeClient.getString(reqBean);
        if (RspCode.SUCCESS.getCode().equals(rspBean.getRespCode())) {
            mav.addObject("name", rspBean.getValue());
        } else {
            mav.addObject("name", "String ==> ERROR!");
            logger.warn(rspBean.toString());
        }
        mav.addObject("type", "type1");
        return mav;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @RequestMapping("/wsSampleStrings")
    public ModelAndView wsSampleStrings() {
        ModelAndView mav = new ModelAndView("welcome");
        ListRequestBean reqBean = new ListRequestBean();
        List param = new ArrayList();
        param.add("List String ==> 0");
        param.add("List String ==> 1");
        param.add("List String ==> 2");
        param.add("List String ==> 3");
        reqBean.setList(param);
        ListResponseBean rspBean = sampleFacadeClient.getStrings(reqBean);
        if (RspCode.SUCCESS.getCode().equals(rspBean.getRespCode())) {
            mav.addObject("name", rspBean.getList());
        } else {
            mav.addObject("name", "List ==> ERROR!");
            logger.warn(rspBean.toString());
        }
        mav.addObject("type", "type2");
        return mav;
    }

    @RequestMapping("/wsSampleObject")
    public ModelAndView wsSampleObject() {
        ModelAndView mav = new ModelAndView("welcome");
        SampleRequestBean reqBean = new SampleRequestBean();
        reqBean.setAddress("Sample Object ==> address");
        reqBean.setId("Sample Object ==> id");
        reqBean.setUsername("Sample Object ==> username");
        reqBean.setPassword("Sample Object ==> password");
        SampleResponseBean rspBean = sampleFacadeClient.getObj(reqBean);
        if (RspCode.SUCCESS.getCode().equals(rspBean.getRespCode())) {
            mav.addObject("name", rspBean);
        } else {
            mav.addObject("name", "List ==> ERROR!");
            logger.warn(rspBean.toString());
        }
        mav.addObject("type", "type3");
        return mav;
    }

}
