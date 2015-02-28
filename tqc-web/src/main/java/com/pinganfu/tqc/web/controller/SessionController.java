package com.pinganfu.tqc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pinganfu.dochelper.annotation.PAFDoc;
import com.pinganfu.dochelper.annotation.PAFDoc.VERSION;

@PAFDoc(title = "权限控制模块", desc = "提供针对用户URI的权限控制服务",  author="yanjiawei", version=VERSION.V150129 )
@Controller
@RequestMapping(value = "/session")
public class SessionController {

	@PAFDoc(title = "使用登陆密码登陆", desc = "查询商户信息和关联门店信息", author = "yanjiawei", version = VERSION.V150129)
	@RequestMapping(value="/loginWithPwd", method = RequestMethod.POST)
	@ResponseBody
	public String loginWithPwd(String accountName, String pwd){
		System.out.println("使用用户名密码登陆");
		return "test";
	}
}
