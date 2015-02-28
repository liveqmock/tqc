package com.pinganfu.tqc.common.dal.dao.rbac;

import com.pinganfu.tqc.common.dal.model.rbac.CommonUserRoleRelDO;

public interface CommonUserRoleRelDao {
    int insert(CommonUserRoleRelDO record);

    int insertSelective(CommonUserRoleRelDO record);
}