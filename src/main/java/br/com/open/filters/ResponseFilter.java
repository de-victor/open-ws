package br.com.open.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

import br.com.open.util.ResponseWs;

@Provider
public class ResponseFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext request, ContainerResponseContext response) throws IOException {
		corsFilter(response);
		generateProcessingTime(response, request);

	}

	private void generateProcessingTime(ContainerResponseContext response, ContainerRequestContext request) {
		Long timeProcessed = new Long(request.getHeaders().get(ResponseWs.timeProcessed).get(0));
		
		Double time = new Double((System.currentTimeMillis() - timeProcessed)/1000.0);
		
		response.getHeaders().add("time_processed", time);
		
	}

	private void corsFilter(ContainerResponseContext response) {
		response.getHeaders().add("Access-Control-Allow-Origin", "*");
		response.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
		response.getHeaders().add("Access-Control-Allow-Credentials", "true");
		response.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
	}

}
