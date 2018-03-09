package com.mycompany.app;

import java.util.Date;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/my")
@Produces(MediaType.APPLICATION_XML)
public class MyRS {

	@Inject
	private MyApplicationScopedBean myApplicationScopedBean;

        @Path("/test")
	@GET
	public Response test() {
		myApplicationScopedBean.tryVelocity();
		return Response.ok().build();
	}

}