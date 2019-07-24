package com.businesslayer;

import static io.restassured.RestAssured.when;
import static io.restassured.path.json.JsonPath.from;

import com.response.pojos.SinglePhoto;

import io.restassured.response.Response;


/**
 * Business Layer : Sole purpose is to accept data and populate POJOs and 
 * further perform some task related to particular domain
 * 
 * This class will contains all logic related to API http://<domain>/photos/<id>
 *
 */
public class SinglePhotoBusinessLogic {

	// TODOs: read from property files
	static String baseUrl = "http://jsonplaceholder.typicode.com";

	
	/*
	 * Extract data as Response object
	 * 
	 * Populate respective Response POJOs
	 */
	public static SinglePhoto getSinglePhotoDataFor(String id) {
		String url = baseUrl + "/photos/" + id;
		System.out.println("URL to be hit:" + url);
		
		Response response = when().get(url);
		SinglePhoto singlePhoto = response.getBody().as(SinglePhoto.class);
		System.out.println(singlePhoto);
		return singlePhoto;
	}
	
	
	
	
	
	/*
	 * Extract data as String/JsonPath
	 * 
	 * Note: This method is same as above method. Just that we are using JsonPath feature to extract data
	 *       This is a bit lengthy compared to above	
	 */
	public static SinglePhoto getSinglePhotoDataForUsingString(String id) {
		String url = baseUrl + "/photos/" + id;
		System.out.println("URL to be hit:" + url);
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
