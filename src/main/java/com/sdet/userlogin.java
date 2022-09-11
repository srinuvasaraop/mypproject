package com.sdet;

import java.util.ResourceBundle;

public class userlogin {

	public int login(String user_login,String user_password)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String userNaeme=rb.getString("username");
		String userPassword=rb.getString("password");
		if(user_login.equals(userNaeme)&&user_password.equals(userPassword))
		{
			return 1; 
		}
		return 0;
	}
}
