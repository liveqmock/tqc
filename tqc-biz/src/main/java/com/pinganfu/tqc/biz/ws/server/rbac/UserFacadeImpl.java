package com.pinganfu.tqc.biz.ws.server.rbac;

import com.pinganfu.tqc.common.facade.bean.rbac.UserAddRequest;
import com.pinganfu.tqc.common.facade.bean.rbac.UserAddResponse;
import com.pinganfu.tqc.common.facade.rbac.UserFacade;

public class UserFacadeImpl implements UserFacade{

	@Override
	public UserAddResponse addUser(UserAddRequest userAddRequest) {
		System.out.println("execute addUser");
		return null;
	}

	
}
