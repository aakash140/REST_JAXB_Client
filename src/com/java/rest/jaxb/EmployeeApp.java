package com.java.rest.jaxb;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class EmployeeApp {
	public static final String BASE_URI = "http://localhost:8081/REST_JAXB_Server";
	public static final String EMPLOYEE_DETAILS = "/employee/get/";

	public static void main(String[] args) {
		ClientConfig clientConfig = new DefaultClientConfig();
		Client client = Client.create(clientConfig);
		WebResource webService = client.resource(BASE_URI);

		WebResource employeeService = webService.path("rest").path(EMPLOYEE_DETAILS + 1234);
		System.out.println(employeeService.accept(MediaType.APPLICATION_XML).get(String.class));
	}
}