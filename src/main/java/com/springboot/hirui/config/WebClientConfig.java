package com.springboot.hirui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorResourceFactory;

@Configuration
public class WebClientConfig {
	   @Bean
	    ReactorResourceFactory resourceFactory() {
		   return new ReactorResourceFactory();
	    }
}