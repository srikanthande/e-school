package com.smartSchool.pojo;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Test {

	public static void main(String args[]) throws Exception{
		
		
		String baseServiceURI = "http://localhost:8080/SmartSchoolAppService/restAPI/hello/post2";
		Track tt = new Track();
		tt.setSinger("Srikanth");
		tt.setTitle("ttitle");
		String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
		ObjectMapper mapper = new ObjectMapper();
		Track obj = mapper.readValue(input, Track.class);
		Client client = Client.create();
		  WebResource service = client.resource(baseServiceURI);
		  ClientResponse response = service.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, obj);
			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);
		
		
			
	}
}
