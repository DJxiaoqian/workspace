package com.fanvemaker.boot.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fanvemaker.boot.user.dao.UserDAO;
import com.fanvemaker.boot.user.model.UserDTO;
import com.fanvemaker.boot.user.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserDAO userDAO;

	@Override
	public UserDTO getUserByUsername(String username) {
		return userDAO.findByUsername(username);
	}
	
}
