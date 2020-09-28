package com.springboot.hirui.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;


@Order(1)
@WebFilter(filterName="firstFilter", urlPatterns="/*")
public class RestRequestFilter implements Filter {

	private static final Logger log = LoggerFactory.getLogger(Filter.class);
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		log.info("REQUEST: url={} method={}", httpRequest.getRequestURL().toString(), httpRequest.getMethod()
				);
		chain.doFilter(httpRequest, response);
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		log.info("RESPONSE: {}", httpResponse.getStatus());
	}

}
