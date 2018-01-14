package com.fanvemaker.boot.test.user.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fanvemaker.boot.BaseApplicationTests;
import com.fanvemaker.boot.user.dao.UserDAO;

public class UserDAOTest extends BaseApplicationTests{
	@Autowired
	private UserDAO userDAO;
	
	@Test
	public void testFindAll() throws Exception {
		System.out.println(userDAO.findByUsername("admin"));
		System.out.println(userDAO.findOne("fa2be530f86411e785ee00163e0f5416"));
	}
	
	
	
}
