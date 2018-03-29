package com.intellociplabs.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

	
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test() throws Exception {
		
		return "Hi........";
	}
	
	@RequestMapping(value = "testSecurity", method = RequestMethod.GET)
	public String testSecurity() throws Exception {
		
		return "testSecurity........";
	}
	
	
}
