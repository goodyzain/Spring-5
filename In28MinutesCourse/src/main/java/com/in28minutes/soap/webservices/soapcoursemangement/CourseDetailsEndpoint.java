package com.in28minutes.soap.webservices.soapcoursemangement;

import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.GetCourseDetailsRequest;
import com.in28minutes.courses.GetCourseDetailsResponse;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CourseDetailsEndpoint {

	private Client client;
	
	private WebTarget target;

	// Input - GetCourseDetailsRequest
	// Output - GetCourseDetailsResponse

	@PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse processCourseDetails(@RequestPayload GetCourseDetailsRequest request) {
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		CourseDetails courseDetail = new CourseDetails();
		courseDetail.setName("Microservices Course");
		courseDetail.setDescription("This is awesome");
		response.setCourseDetails(courseDetail);
		return response;
	}

}
