
package com.exception;

import javax.security.auth.login.LoginException;

public class UserClass {
	public static void main(String[] args) throws LoginException {
		int value = 10;
		LoginException e = new LoginException();
		if (value < 25)
			throw e;

	}
}
