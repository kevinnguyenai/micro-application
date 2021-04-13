package com.app.microapplication.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;

@Component
public class SimpleFilter implements Filter {
	@Override
	public void destroy() {
		
	}
	
	@Override
	public void doFilter
	(ServletRequest request, ServletResponse response, FilterChain filter) throws IOException, ServletException {
		System.out.println("Remote Host:" + request.getRemoteHost());
		System.out.println("Remote Address:" + request.getRemoteAddr());
		filter.doFilter(request, response);
	}
	

	
	@Override
	public void init(FilterConfig filterconfig) throws ServletException{}
}
