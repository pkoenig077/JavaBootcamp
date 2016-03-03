package com.customerService.list;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/show")
public class listCustomers {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public customer listService(){
		 customer c = new customer();
		 c.setID("12345");
		 c.setName("PERSON");
		 return c;
	}
}
