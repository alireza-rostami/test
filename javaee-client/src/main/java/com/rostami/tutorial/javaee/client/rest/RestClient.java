/**
 * 
 */
package com.rostami.tutorial.javaee.client.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.jackson.JacksonFeature;

/**
 * @author Alireza
 *
 */
public class RestClient {
	
	private final String HOST = "localhost";
	private final String PORT = "8080";
	private String URL_REST = "";
	
	public RestClient(){
		URL_REST= "http://"+HOST+":"+PORT+"/javaee-web/rest/ejbWS/";
	}
	
	public void runClient(){
		Client client = ClientBuilder.newClient().register(JacksonFeature.class);
		WebTarget target = client.target(URL_REST);
		String x = target.path("testXml").request().get(String.class);
		System.out.println(x);
	}
	
	public void runBookService(){
		Client client = ClientBuilder.newClient().register(JacksonFeature.class);
		WebTarget target = client.target(URL_REST);
		String x = target.path("getBook").request().get(String.class);
		System.out.println(x);
                x = target.path("getGreeting").request().get(String.class);
                System.out.println(x);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RestClient client = new RestClient();
		client.runClient();
		client.runBookService();
	}

}
