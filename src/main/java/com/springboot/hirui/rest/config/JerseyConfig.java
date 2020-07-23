package com.springboot.hirui.rest.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.springboot.hirui.rest.resources.HelloResource;
import com.springboot.hirui.rest.resources.UserController;

@Component
@ApplicationPath("/rest/hi/api")
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
		register(HelloResource.class);
		register(UserController.class);
	}
}
