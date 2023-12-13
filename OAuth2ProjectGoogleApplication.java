package com.oauthgoogle;

import java.security.Principal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class OAuth2ProjectGoogleApplication {
	
	@GetMapping
	public String welcome() {
		return "Welcome to OAuth 2 [Google] !!!";
	}
	
	@GetMapping("/user")
	public Principal user(Principal principal) {
		System.out.println("Username : "  + principal.getName());
		return principal;
	}

	public static void main(String[] args) {
		SpringApplication.run(OAuth2ProjectGoogleApplication.class, args);
	}

}
