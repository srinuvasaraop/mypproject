package com.sedt;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sdet.userlogin;

public class userloginTest {
	@Test
	public void tetslogin1() {
		userlogin us = new userlogin();

		Assert.assertEquals(0, us.login("abc", "abc123"));
	}

	@Test
	public void tetslogin2() {
		userlogin us = new userlogin();

		Assert.assertEquals(1, us.login("abc", "abc@123"));
	}
}
