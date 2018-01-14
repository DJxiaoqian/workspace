package com.fanvemaker.boot.user.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class PasswordUtils {
	public static String MD5password(String code,String password){
		StringBuffer  stringBuffer =new StringBuffer();
		stringBuffer.append(DigestUtils.md5Hex(password));
		stringBuffer.append(code);
		return DigestUtils.md5Hex(stringBuffer.toString());
	}
}
