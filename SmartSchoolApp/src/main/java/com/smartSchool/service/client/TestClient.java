package com.smartSchool.service.client;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



public class TestClient {

	public static void main(String args[]){
	
		/*
		 
		String baseServiceURI = "http://localhost:8080/SmartSchoolAppService/restAPI/hello/post1";
		String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
		Client client = Client.create();
		  WebResource service = client.resource(baseServiceURI);
		  ClientResponse response = service.type(MediaType.APPLICATION_JSON)
				   .post(ClientResponse.class, input);
			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);
		*/
			
		String baseServiceURI = "http://localhost:8080/SmartSchoolAppService/restAPI/hello/post2";
		String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
		Client client = Client.create();
		  WebResource service = client.resource(baseServiceURI);
		  ClientResponse response = service.type(MediaType.APPLICATION_JSON)
				   .post(ClientResponse.class, input);
			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);
			
	}
	  
}
