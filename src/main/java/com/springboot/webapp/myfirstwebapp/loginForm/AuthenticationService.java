package com.springboot.webapp.myfirstwebapp.loginForm;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticateUser(String name,String password){
		if(name.equalsIgnoreCase("Diksha") && password.equalsIgnoreCase("Sinha"))
			return true;
		return false;
	}

}
