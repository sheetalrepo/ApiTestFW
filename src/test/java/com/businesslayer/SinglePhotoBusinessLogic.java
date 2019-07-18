package com.businesslayer;

import static io.restassured.RestAssured.when;
import static io.restassured.path.json.JsonPath.from;

import io.restassured.response.Response;
import com.data.pojos.SinglePhoto;

public class SinglePhotoBusinessLogic {

	

	// TODOs: read from property files
	static String baseUrl = "http://jsonplaceholder.typicode.com";

	
	/*
	 * Extract data as Response
	 * 
	 * Populate respective POJOs
	 */
	public static SinglePhoto getSinglePhotoDataFor(String id) {
		String url = baseUrl + "/photos/" + id;
		System.out.println("url to be hit:" + url);
		
		Response response = when().get(url);
		SinglePhoto singlePhoto = response.getBody().as(SinglePhoto.class);
		System.out.println(singlePhoto);
		return singlePhoto;
	}
	
	
	
	
	
	/*
	 * Extract data as String/JsonPath
	 * 
	 * Populate respective POJOs
	 * Note: Above method is more efficient
	 */
	public static SinglePhoto getSinglePhotoDataForUsingString(String id) {
		String url = baseUrl + "/photos/" + id;
		System.out.println("url to be hit:" + url);
		String responseAsString = when().get(url).then().statusCode(200).extract().asString();

		SinglePhoto singlePhoto = new SinglePhoto();
		singlePhoto.setAlbumId(from(responseAsString).get("albumId").toString());
		singlePhoto.setId(from(responseAsString).get("id").toString());
		singlePhoto.setTitle(from(responseAsString).get("title").toString());
		singlePhoto.setUrl(from(responseAsString).get("url").toString());
		singlePhoto.setThumbnailUrl(from(responseAsString).get("thumbnailUrl").toString());

		return singlePhoto;
	}
	
	
	
	
}
