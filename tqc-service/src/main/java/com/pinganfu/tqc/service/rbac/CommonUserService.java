package com.pinganfu.tqc.service.rbac;

import java.util.List;

import com.pinganfu.tqc.service.model.rbac.CommonUserDTO;

public interface CommonUserService {

	public boolean addUser(CommonUserDTO dto);
	
	public boolean updateUser(CommonUserDTO dto);
	
	public CommonUserDTO findUser(CommonUserDTO dto);
	
	public List<CommonUserDTO> findUserList(CommonUserDTO dto);
}
