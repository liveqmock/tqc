package com.pinganfu.tqc.common.facade.rbac;

import javax.jws.WebService;

import com.pinganfu.tqc.common.facade.bean.rbac.UserAddRequest;
import com.pinganfu.tqc.common.facade.bean.rbac.UserAddResponse;

@WebService
public interface UserFacade {

	public UserAddResponse addUser(UserAddRequest userAddRequest);
	
}
