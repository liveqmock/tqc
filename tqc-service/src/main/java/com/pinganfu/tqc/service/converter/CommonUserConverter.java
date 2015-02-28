package com.pinganfu.tqc.service.converter;

import com.pinganfu.tqc.common.dal.model.rbac.CommonUserDO;
import com.pinganfu.tqc.common.util.ConvertBeanUtil;
import com.pinganfu.tqc.service.model.rbac.CommonUserDTO;

public class CommonUserConverter {

	public static CommonUserDTO do2dto(CommonUserDO commonUserDO) {
		if (null == commonUserDO) {
			return null;
		}
		CommonUserDTO commonUserDTO = new CommonUserDTO();
		ConvertBeanUtil.copyBeanProperties(commonUserDO, commonUserDTO);
		return commonUserDTO;
	}

	public static CommonUserDO dto2do(CommonUserDTO commonUserDTO) {
		if (null == commonUserDTO) {
			return null;
		}
		CommonUserDO commonUserDO = new CommonUserDO();
		ConvertBeanUtil.copyBeanProperties(commonUserDTO, commonUserDO);
		return commonUserDO;
	}

}
