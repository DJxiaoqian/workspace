package com.fanvemaker.boot.test.util;

import org.junit.Test;

import com.fanvemaker.boot.user.utils.PasswordUtils;

public class PasswordUtilTest {
	
	@Test
	public void testMD5password() throws Exception {
		System.out.println(PasswordUtils.MD5password("qn81bc", "123456"));
	}
}
