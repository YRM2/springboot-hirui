package com.springboot.hirui.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

@Component
@Path("/rm")
public class HelloResource {

	@GET
	@Path("/hello")
	@Produces({MediaType.TEXT_HTML+";charset=utf-8", MediaType.APPLICATION_JSON +";charset=utf-8"})
	public Response sayHello() {
		return Response.status(200).entity(JSON.toJSONString("分布式")).build();
	}
}
