package com.exception;

import javax.security.auth.login.LoginException;

public class TestException {
	public static void Authenticate(String login)throws LoginExecption{
		LoginExecption e = new LoginExecption();
		if (!"admin".equals(login)) {
			System.out.println(e.getMessage()+"----sop-----");
			throw e;
			
		}
		
	}

	public static void main(String[] args) throws Exception {
		Authenticate("adminn");
		
		
	}

}
