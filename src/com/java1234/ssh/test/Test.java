package com.java1234.ssh.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	ApplicationContext ioc =new ClassPathXmlApplicationContext("applicationContext.xml");
	@org.junit.Test
	public void test01() throws SQLException{
		DataSource dataSource = ioc.getBean(DataSource.class);
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		System.out.println("111111111111111111111111111----------测试GitHub")
		
	}

}
