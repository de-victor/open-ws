package br.com.open.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

import br.com.open.util.ResponseWs;

@Provider
public class RequestFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext request) throws IOException {
		markTime(request);
	}

	private void markTime(ContainerRequestContext request) {
		Long time = System.currentTimeMillis();
		request.getHeaders().add(ResponseWs.timeProcessed, time+"");
	}

}
