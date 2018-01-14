package com.fanvemaker.boot.user.service;

import com.fanvemaker.boot.user.model.UserDTO;

public interface IUserService {
	UserDTO getUserByUsername(String username);
}
