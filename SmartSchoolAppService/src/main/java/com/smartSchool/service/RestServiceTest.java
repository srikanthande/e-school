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

	/**
	 * Below method is a GET request for fetching the data just by passing the input string in URL.
	 * @param msg
	 * @return
	 */
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
	
	/**
	 * Below method is a POST request for fetching the response by passing a String object.
	 * @param track
	 * @return
	 */
	  	@POST
		@Path("/post1")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response createTrackInString(String track) {
		  System.out.println("entered");
			String result = "Track saved : " + track;
			return Response.status(201).entity(result).build();
			
		}
	  	
	  	/**
		 * Below method is a POST request for fetching the response by passing a custom object.
		 * @param track
		 * @return
		 */
		@POST
		@Path("/post2")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response createTrackInJSON(Track track) {
		  System.out.println("entered object-response");
			String result = "Track saved : " + track;
			return Response.status(201).entity(result).build();
			
		}
		
		/**
		 * Below method is a POST request for fetching a custom object by passing a custom object.
		 * @param track
		 * @return
		 */
		@POST
		@Path("/post3")
		@Consumes(MediaType.APPLICATION_JSON)
		public Track createTrackInObject(Track track) {
		  System.out.println("entered object-custom");
			track.setSinger("output");
			return track;
			
		}
}
