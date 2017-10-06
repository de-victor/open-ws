package br.com.open.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/message")
public class HelloWorldService {

	@GET
	@Path("/hello")
	public String getMsg() {
		return "Welcome to a simple test with Jersey 2.x";
	}

}
