package br.com.open.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.open.util.ResponseWs;

public abstract class WebserviceImp<Entity> implements WebserviceInterface<Entity> {
	
	private final static String working = "Method still in developin";
	
	@Override
	@POST
	@Path("/search")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response search(Entity entity) {
		return ResponseWs.forbiden(working);
	}

	@Override
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(Entity entity) {
		return ResponseWs.forbiden(working);
	}

	@Override
	@POST
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(Entity entity) {
		return ResponseWs.forbiden(working);
	}

}
