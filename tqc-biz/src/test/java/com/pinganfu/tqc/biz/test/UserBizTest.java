/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.biz.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.pinganfu.common.test.BaseFunctionalitySimpleTests;
import com.pinganfu.tqc.biz.UserBiz;
import com.pinganfu.tqc.service.model.User;

/**
 * 
 * @author Jing
 * @version $Id: UserBizTest.java, v 0.1 2013年8月14日 上午10:36:58 Jing Exp $
 */
@Ignore
public class UserBizTest extends BaseFunctionalitySimpleTests {

	private static String ID = "userBiz";

	@Test
	public void addUser() {
		UserBiz ub = (UserBiz) getBean(ID);
		String userName = "UserName";
		User user = new User();
		user.setUserName(userName);
		ub.addUser(user);
		Assert.assertTrue(user.getUserId() > 0);
	}

	@Test
	public void delUserByPK() {
		UserBiz ub = (UserBiz) getBean(ID);
		Integer id = new Integer(10000);
		ub.delUserByPK(new Integer(10000));
		Assert.assertNull(ub.getUserByPK(id));
	}

	@Test
	public void modifyUser() {
		UserBiz ub = (UserBiz) getBean(ID);
		User user = ub.getUser(new User("TEST_USER_NAME"));
		user.setUserName("AAABBBCCC");
		ub.modifyUser(user);
		User rs = ub.getUserByPK(user.getUserId());
		Assert.assertTrue("AAABBBCCC".equals(rs.getUserName()));
	}

	@Test
	public void getUserList() {
	}

}
