package com.fanvemaker.boot.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.fanvemaker.boot.user.model.UserDTO;
@Component
public interface UserDAO extends JpaRepository<UserDTO, String>{
	
	UserDTO findByUsername(String username);
}
