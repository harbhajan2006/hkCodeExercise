package soapSampleDOC;

import javax.xml.ws.Endpoint;

import soapSampleDOC.*;

//Endpoint publisher
public class WelcomeWorldPublisher{

	public static void main(String[] args) {
		System.out.println("**********************");
	    Endpoint.publish("http://localhost:9999/ws/welcome", new WelcomeWorldImpl());
    }

}
