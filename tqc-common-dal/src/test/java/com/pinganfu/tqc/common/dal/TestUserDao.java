package com.pinganfu.tqc.common.dal;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pinganfu.tqc.common.TestBaseTemplate;
import com.pinganfu.tqc.common.dal.dao.UserDao;
import com.pinganfu.tqc.common.dal.model.UserDO;

public class TestUserDao extends TestBaseTemplate{

	@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Test
	public void testAddUser(){
		UserDO userDO = new UserDO();
		userDO.setUserName("yanjiawei");
		userDO.setMobile("18616968346");
		userDO.setEmail("webmovie@163.com");
		userDO.setPwd("yanjiawei");
		int insertResult = userDao.insertData(userDO);
		echo(insertResult);
	}
	
	
}
