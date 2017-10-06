package br.com.open.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.open.dao.ExemploMockDao;
import br.com.open.interfaces.WebserviceImp;
import br.com.open.models.mock.ExempleModel;
import br.com.open.util.ResponseWs;

@Path("/exemple")
public class ExempleService extends WebserviceImp<ExempleModel> {
	
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMsg() {
		StringBuilder text = new StringBuilder();
		text.append("Hello, welcome to a simple implemantation of a Jersey 2.x webservice.\n");
		text.append("I hope this simple work will bring light to your study or project!");
		return text.toString();
	}
	
	/*
	 * A model how to improve from
	 * abstract class to keep the services
	 * with same signature
	 */
	@Override
	@POST
	@Path("/search")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response search(ExempleModel entity) {
		return ResponseWs.accepted(ExemploMockDao.getInstance().getExemples(entity));
	}

}
