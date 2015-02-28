package com.pinganfu.tqc.service.impl.rbac;

import java.util.List;

import com.pinganfu.tqc.common.dal.dao.rbac.CommonUserDao;
import com.pinganfu.tqc.common.dal.model.rbac.CommonUserDO;
import com.pinganfu.tqc.service.converter.CommonUserConverter;
import com.pinganfu.tqc.service.model.rbac.CommonUserDTO;
import com.pinganfu.tqc.service.rbac.CommonUserService;

public class CommonUserImpl implements CommonUserService{
	
	private CommonUserDao commonUserDao;

	public void setCommonUserDao(CommonUserDao commonUserDao) {
		this.commonUserDao = commonUserDao;
	}

	@Override
	public boolean addUser(CommonUserDTO dto) {
		CommonUserDO userDO = CommonUserConverter.dto2do(dto);
		int insertResult = commonUserDao.insertData(userDO);
		return (insertResult > 0) ? true : false;
	}

	@Override
	public boolean updateUser(CommonUserDTO dto) {
		CommonUserDO userDO = CommonUserConverter.dto2do(dto);
		int updateResult = commonUserDao.updateData(userDO);
		return (updateResult > 0) ? true : false;
	}

	@Override
	public CommonUserDTO findUser(CommonUserDTO dto) {
		CommonUserDO userDO = CommonUserConverter.dto2do(dto);
		userDO = commonUserDao.queryObject(userDO);
		return CommonUserConverter.do2dto(userDO);
	}

	@Override
	public List<CommonUserDTO> findUserList(CommonUserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
