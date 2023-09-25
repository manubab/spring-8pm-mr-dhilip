package com.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.service.JwtTokenUtil;
import com.service.UserService;
@Component
public class JwtTokenAuthenticationFilters extends OncePerRequestFilter 
{
	@Autowired
	JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	UserService service;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)                                                                       
			throws ServletException, IOException {


		String token=request.getHeader("Authorization");
		
		System.out.println(token);
		
		String userNameFromToken=null;
		
		if(token==null)
		{
			System.out.println("Please Add valid Token Token is Requeired");
		}else
		{
			userNameFromToken =this.jwtTokenUtil.getUserNameFromToken(token);
		}
		
		if(userNameFromToken!=null&&SecurityContextHolder.getContext().getAuthentication()==null)
		{
			
			UserDetails userDetails=this.service.loadUserByUsername(userNameFromToken);
			
			
			boolean isValidToken=this.jwtTokenUtil.isValidateToken(userDetails.getUsername(), token);
		
			 
			
			
			if(isValidToken)
			{
				UsernamePasswordAuthenticationToken ac=new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
				
				SecurityContextHolder.getContext().setAuthentication(ac);
			}
			else
			{
				System.out.println("Token invalid  ..please come with valid Token");
			}
		}
		
		
		filterChain.doFilter(request, response);
		
		
	}

}
