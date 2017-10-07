package br.com.open.interfaces;

import javax.ws.rs.core.Response;

public interface WebserviceInterface<Entity> {
	/*
	 * This interface will help to maintain
	 * all other services with the same
	 * methods.
	 */
	public Response search(Entity entity);
	public Response update(Entity entity);
	public Response delete(Entity entity);
	public Response insert(Entity entity);

}
