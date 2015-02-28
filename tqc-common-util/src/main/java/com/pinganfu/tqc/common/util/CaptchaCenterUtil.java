/**
 * 
 *	平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.util;

import java.util.UUID;



import com.pinganfu.common.context.SystemContext;

/**
 * 
 * @author wcx
 * @version $Id: CertUtil.java, v 0.1 2013-7-31 下午2:19:45 wcx Exp $
 */

public class CaptchaCenterUtil {

	/**分割符*/
	public static final String separatorPro = "_";

	/**
	 * 直接获取获取验证码id
	 */
	public static String getCaptchaCenterId() {
		return getCaptchaCenterUid();
	}
	
	 /**
     * 获取验证中心数据操作地址
     * 
     * @return
     */
	public static String getCaptWebCodeWsUrl() {
		return SystemContext.get("captchacode_ws_url");
	}

	 /**
     * 获取验证中心数据操作地址
     * 
     * @return
     */
	public static String getCaptWebCodePreWsUrl(){
		return  SystemContext.get("captchacodepre_ws_url");
	}
	
	 /**
     * 获取验证码地址
     * 
     * @return
     */
	public static String getCaptImgUrl() {
		return SystemContext.get("captchacenter_code_url");
	}

	/**
	 * 从配置中心获取验证验证码webservice地址
	 */
	public static String getCaptWsUrl() {
		return SystemContext.get("captchacenter_ws_url");
	}
 

	/**
	 * 生成验证码uuid
	 */
	private static String getCaptchaCenterUid() {
		return urlFilter(UUID.randomUUID().toString());
	}

	/**
	 * 过滤掉url中的特殊字符
	 */
	private static String urlFilter(String s) {
		return s.replaceAll("[+? /%#&=]", "");
	}
}
