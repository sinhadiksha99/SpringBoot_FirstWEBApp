package com.springboot.webapp.myfirstwebapp.loginForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginFormController {
	private AuthenticationService authenticationService;
	
	public LoginFormController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value="loginForm", method=RequestMethod.GET)
	public String goToLogin() {
		return "loginForm";
	}
	
	@RequestMapping(value="/loginForm", method=RequestMethod.POST)
	public String goToWelcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(authenticationService.authenticateUser(name, password)) {
			model.put("name",name);
			return "welcome";
		}
		model.put("errorMessage", "INVALID CREDENTIALS, Please Try Again");
		return "loginForm";
	}
	
}
