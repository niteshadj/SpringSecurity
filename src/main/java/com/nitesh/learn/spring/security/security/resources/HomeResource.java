package com.nitesh.learn.spring.security.security.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeResource {

	@GetMapping("/")
	public static String hello() {
		return "Welcome";
	}
	
	@GetMapping("/user")
	public static String welcomeUser() {
		return "Welcome User";
	}
	
	@GetMapping("/admin")
	public static String welcomeAdmin() {
		return "Welcome Admin";
	}

}
