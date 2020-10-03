package com.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("À¹½ØÆ÷");
		if (request.getSession().getAttribute("user")!=null) {
			return true;
		}else {
			response.sendRedirect("dd");
			return false;
		}
		
	}
	
}
