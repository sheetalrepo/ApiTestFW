package com.data.helper;

import static io.restassured.RestAssured.given;
import static io.restassured.path.json.JsonPath.from;

import java.util.List;

import com.data.pojos.SinglePhoto;
//import io.restassured.response.Response;


public class DataProvider {

	String baseUrl = "http://jsonplaceholder.typicode.com";
	String uri = "/photos";
	
	public SinglePhoto getSinglePhotoData(String id) {
		
		String url = baseUrl+uri+"/"+id;
		System.out.println("url to be hit:"+ url);
		
		//hit url and read all objects 
		//populate POJOs
		
		String responseAsString=
				when().
					get(url).
				then().
				extract().asString();

		List<Integer> albumIds = from(responseAsString).get("id");		
		System.out.println(albumIds.size());
		
		
		return new SinglePhoto();
	}
	
	
	
	
}
