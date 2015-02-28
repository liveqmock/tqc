package com.pinganfu.tqc.common;


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 测试模板类
 * @author yanjiawei 2015.01.14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/spring/applicationContext*.xml",
		"classpath*:/spring/datasource.xml"})  //Spring-Test的这个配置只认classpath
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)   //SpringJUnit支持，由此引入Spring-Test框架支持！
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)
public abstract class TestBaseTemplate{
	
	protected void echo(Object str){
		System.out.println(str);
	}
	
}
