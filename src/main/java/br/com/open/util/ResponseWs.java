package br.com.open.util;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.gson.Gson;

import br.com.open.models.response.ResponseModel;

public class ResponseWs {

	public static String timeProcessed = "time_processed";
	
	public static Response forbiden(String msg){
		ResponseModel response = new ResponseModel(403, msg);
		
		return Response.status(Status.FORBIDDEN).entity(response).build();
	}
	
	public static Response accepted(Object obj){
		
		Gson gson = new Gson();
		
		String processed = gson.toJson(obj);
		
		return Response.status(Status.ACCEPTED).entity(processed).build();
	}
}
