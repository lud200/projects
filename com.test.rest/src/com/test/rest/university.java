package com.test.rest;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/university")
public class university {
@GET
@Produces(MediaType.TEXT_PLAIN)

public String getUniversityInfo(){
	return "NewYork University";
}

@PUT
@Path("{studentNo}")
@Produces(MediaType.TEXT_PLAIN)

public String updateUniversityInfo(@PathParam("studentNo") String number){
	return "Done !";
}
}