package com.fanvemaker.boot.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fanvemaker.boot.common.model.ResponseVO;
import com.fanvemaker.boot.user.model.UserDTO;
import com.fanvemaker.boot.user.service.IUserService;
import com.fanvemaker.boot.user.utils.PasswordUtils;

@RestController
@RequestMapping("/admin/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	

	/**
	 * 登录接口
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@PostMapping("/login")
	public ResponseVO login(String username, String password,HttpSession session) {
		ResponseVO response = new ResponseVO();
		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			response.setCode(201);
			response.setMsg("帐号或密码不能为空");
			response.setSuccess(false);
			return response;
		}
		UserDTO user = userService.getUserByUsername(username);
		if (user==null) {
			response.setCode(202);
			response.setMsg("帐号或密码不正确");
			response.setSuccess(false);
			return response;
		}
		String md5password = PasswordUtils.MD5password(user.getCode(), password);
		if (!user.getPassword().equals(md5password)) {
			response.setCode(203);
			response.setMsg("帐号或密码不正确");
			response.setSuccess(false);
			return response;
		}
		session.setAttribute("userid", user.getId());
		response.setCode(100);
		response.setMsg("登录成功");
		response.setSuccess(true);
		Map<String, Object> data = new HashMap<>();
		data.put("username", user.getUsername());
		response.setData(data);
		return response;
	}
}
