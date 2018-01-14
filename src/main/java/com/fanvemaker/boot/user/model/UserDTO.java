package com.fanvemaker.boot.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author yqg
 *
 */
@Entity
@Table(name="t_zjrhysp_user")
public class UserDTO {
	@Id
	@Column(name="fid")
	private String id;
	@Column(name="fusername")
	private String username;
	@Column(name="fpassword")
	private String password;
	@Column(name="fcode")
	private String code;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", username=" + username + ", password=" + password + ", code=" + code + "]";
	}
	
	
}
