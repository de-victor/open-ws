package br.com.open.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/message")
public class HelloWorldService {

	@GET
	@Path("/hello")
	public String getMsg() {
		return "Hello World !! - Jersey 2!!!";
	}

}
