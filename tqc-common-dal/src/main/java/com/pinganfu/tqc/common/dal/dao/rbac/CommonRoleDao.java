package com.pinganfu.tqc.common.dal.dao.rbac;

import com.pinganfu.tqc.common.dal.model.rbac.CommonRoleDO;

public interface CommonRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CommonRoleDO record);

    int insertSelective(CommonRoleDO record);

    CommonRoleDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommonRoleDO record);

    int updateByPrimaryKey(CommonRoleDO record);
}