package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.JwtTokenUtil;
import com.service.UserLogin;
import com.service.UserRegister;
import com.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;

	@Autowired
	JwtTokenUtil util;

	@Autowired
	AuthenticationManager manager;

	@PostMapping("/create/user")
	public String loginUser(@RequestBody UserRegister request) {
		String result = service.registerUser(request);
		return result;

	}

	@PostMapping("/login/user")
	public UserLoginResponse loginUser(@RequestBody UserLogin request) {
		doAuthentication(request.getEmailId(), request.getPassword());

		String token = this.util.createToken(request.getEmailId());

		UserLoginResponse response = new UserLoginResponse();

		response.setEmailId(request.getEmailId());
		response.setToken(token);

		return response;

	}

	public void doAuthentication(String userName, String password) {

		UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
				userName, password);

		try {

		} catch (BadCredentialsException e) {
			throw new RuntimeException("Invalid User Name and password ");
		}
	}

	@GetMapping("/get/token")
	public String getToken() {

		return JwtTokenUtil.createToken("dhilip@gmail.com");
	}

	@GetMapping("/validate/token")
	public boolean validateToken() {
		return JwtTokenUtil.isValidateToken("naresh@gmail.com", "token");
	}

}
