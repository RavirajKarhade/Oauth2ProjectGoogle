package com.oauthgoogle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.DefaultSecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration {

	//it is a security with any request autehntication 
	protected void configure(HttpSecurity http) throws Exception{
		
		http .authorizeRequests() .anyRequest() .authenticated() .and()
		 .oauth2Login();
	}
}
