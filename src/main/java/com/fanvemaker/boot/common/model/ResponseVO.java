package com.fanvemaker.boot.common.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author yqg
 *
 */
@JsonInclude(Include.NON_NULL) 
public class ResponseVO {
	private Boolean success;
	private Integer code;
	private String msg;
	private Map<String, Object> data;
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponseVO [success=" + success + ", code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
	
}
