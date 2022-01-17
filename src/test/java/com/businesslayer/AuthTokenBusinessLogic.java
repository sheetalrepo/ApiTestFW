package com.businesslayer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.data.PropertyFileReader;
import com.pojos.AuthTokenResponse;
import com.pojos.request.AuthTokenRequest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class AuthTokenBusinessLogic {
	private static final Logger LOGGER = LogManager.getLogger(AuthTokenBusinessLogic.class);

	
	public static AuthTokenResponse getAuthTokenResponse(String deivceId, String userName, String xCusName) {
		String baseURL = PropertyFileReader.getPropertyData().getApis().get("homeurl");
		String authApi = PropertyFileReader.getPropertyData().getApis().get("authTokenApi");
		String url = baseURL + authApi;
		LOGGER.info("URL to be hit:" + url);

		AuthTokenRequest authRequest = new AuthTokenRequest();
		authRequest.setDeviceId(deivceId);
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.addHeader("X-Username", userName);
		builder.addHeader("X-Cus", xCusName);
		builder.setContentType(ContentType.JSON);
		builder.setBody(authRequest);
		RequestSpecification requestSpec = builder.build();
				
		AuthTokenResponse authTokenResponse = given().spec(requestSpec).post(url)
				.then().extract().response().as(AuthTokenResponse.class);
		return authTokenResponse;
	}
	
}
