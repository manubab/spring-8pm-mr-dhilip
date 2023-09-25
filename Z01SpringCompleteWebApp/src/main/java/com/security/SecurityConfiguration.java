package com.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration 
{
	
	
	@Autowired
	JwtTokenAuthenticationFilters jwtTokenAuthenticationFilters;
	
	@Bean
	AuthenticationManager getAuthenticationManager(AuthenticationConfiguration config) throws Exception
	{
		
		return config.getAuthenticationManager();
	}

	@Bean
	BCryptPasswordEncoder getbCryptPasswordEncoder()
	{
		
		return new BCryptPasswordEncoder();
		
	}
	
	
	
	
	public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception
	{
		
		System.out.println("This is Security Methods of rules ");
		
		
		security.csrf().disable()
				.authorizeHttpRequests().antMatchers("/create/user","/login/user").permitAll()
				.anyRequest().authenticated()
				.and()
				.addFilterBefore(this.jwtTokenAuthenticationFilters, UsernamePasswordAuthenticationFilter.class);
		
		
		return security.build();
				
	}
	
	
	
	
	
	
	
}
