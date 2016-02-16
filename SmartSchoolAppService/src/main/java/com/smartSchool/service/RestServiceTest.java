package com.smartSchool.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.smartSchool.pojo.Track;

@Path("/hello")
public class RestServiceTest {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
	
	  
	
	/*  @POST
	  //@Path("/post")
	  @Produces(MediaType.APPLICATION_JSON)
	  @Consumes(MediaType.APPLICATION_JSON)
	  public JSONObject sayPlainTextHello( JSONObject inputJsonObj) throws Exception {

	    String input = (String) inputJsonObj.get("input");
	    String output = "The input you sent is :" + input;
	    JSONObject outputJsonObj = new JSONObject();
	    outputJsonObj.put("output", output);

	    return outputJsonObj;
	  } */
	  
	  	@POST
		@Path("/post1")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response createTrackInString(String track) {
		  System.out.println("entered");
			String result = "Track saved : " + track;
			return Response.status(201).entity(result).build();
			
		}
		@POST
		@Path("/post2")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response createTrackInJSON(Track track) {
		  System.out.println("entered json");
			String result = "Track saved : " + track;
			return Response.status(201).entity(result).build();
			
		}
}
