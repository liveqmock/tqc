package com.pinganfu.tqc.common.dal.dao.rbac;

import com.pinganfu.tqc.common.dal.model.rbac.CommonNodeDO;

public interface CommonNodeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CommonNodeDO record);

    int insertSelective(CommonNodeDO record);

    CommonNodeDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommonNodeDO record);

    int updateByPrimaryKey(CommonNodeDO record);
}