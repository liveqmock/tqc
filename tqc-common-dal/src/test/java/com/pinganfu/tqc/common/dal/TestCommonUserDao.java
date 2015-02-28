package com.pinganfu.tqc.common.dal;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pinganfu.tqc.common.TestBaseTemplate;
import com.pinganfu.tqc.common.dal.dao.rbac.CommonUserDao;
import com.pinganfu.tqc.common.dal.model.rbac.CommonUserDO;

public class TestCommonUserDao extends TestBaseTemplate {

	@Autowired
	private CommonUserDao comonUserDao;

	public void setComonUserDao(CommonUserDao comonUserDao) {
		this.comonUserDao = comonUserDao;
	}

	@Test
	public void testAdd() {
		CommonUserDO commonUserDO = new CommonUserDO();
		commonUserDO.setUsername("admin");
		commonUserDO.setPassword("admin");
		commonUserDO.setStatus(1);
		commonUserDO.setRemark("超级管理员，拥有所有资源的权限");
		commonUserDO.setLastLoginIp("127.0.0.1");
		commonUserDO.setLastLoginTime(1234565);
		int insertResult = comonUserDao.insertData(commonUserDO);
		echo("insertResult=" + insertResult);
	}
	
	@Test
	public void testDeleteByPK() {
		Integer commonUserDOPK = 8;
		int deleteResult = comonUserDao.deleteDataByPK(commonUserDOPK);
		echo("deleteResult=" + deleteResult);
	}
	
	@Test
	public void testUpdateData() {
		CommonUserDO commonUserDO = new CommonUserDO();
		commonUserDO.setId(9);
		commonUserDO.setPassword("admin");
		commonUserDO.setStatus(0);
		commonUserDO.setLastLoginIp("196.168.0.114");
		commonUserDO.setLastLoginTime(456789);
		int updateResult = comonUserDao.updateData(commonUserDO);
		echo("updateResult=" + updateResult);
	}
	
	@Test
	public void testQueryByPK() {
		Integer commonUserDOPK = 8;
		CommonUserDO commonUserDO = (CommonUserDO)comonUserDao.queryObjectByPK(commonUserDOPK);
		echo(commonUserDO);
	}
	
	@Test
	public void testQueryForList() {
		List<CommonUserDO> commonUserList = comonUserDao.queryForListAll();
		echo(commonUserList);
	}

}
