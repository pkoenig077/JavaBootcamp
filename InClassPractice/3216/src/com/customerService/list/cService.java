package com.customerService.list;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/list")
public class cService {
@GET
@Produces(MediaType.TEXT_PLAIN)
public String listService(){
	return "Hello World";
}
}
