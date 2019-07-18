package com.businesslayer;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;
import static io.restassured.path.json.JsonPath.from;

import java.util.Arrays;
import java.util.List;

import com.data.pojos.AllPhotos;
import com.data.pojos.SinglePhoto;

import io.restassured.response.Response;

public class AllPhotosBusinessLogic {

	// TODOs: read from property files
	static String baseUrl = "http://jsonplaceholder.typicode.com";

	
	
	/**
	 * Fetch list of all single element nodes from response
	 */
	public static List<String> getListOfElementsFromAlbumId(String albumID, String elementName) {
		String url = baseUrl + "/photos/?albumId=" + albumID;
		System.out.println("url to be hit:" + url);

		String albumResponseString = get(url).asString();
		List<String> listOfElements = from(albumResponseString).getList(elementName);
		return listOfElements;
	}

	
	/**
	 * Fetch list of all small json present inside main json
	 */
	public static AllPhotos getAllPhotosForAlbumId(String albumID) {
		String url = "http://jsonplaceholder.typicode.com/photos/?albumId=" + albumID;
		System.out.println("url to be hit: " + url);

		Response response = when().get(url);
		List<SinglePhoto> allSinglePhotos = Arrays.asList(response.getBody().as(SinglePhoto[].class));

		AllPhotos allPhotos = new AllPhotos();
		allPhotos.setListOfPhotos(allSinglePhotos);

		//System.out.println(allPhotos.toString());
		return allPhotos;
	}

	
	
	

	/**
	 * Fetch list of all small json present inside main json
	 */
	public static AllPhotos getAllPhotos() {
		String url = "http://jsonplaceholder.typicode.com/photos";
		System.out.println("url to be hit: " + url);

		Response response = when().get(url);
		List<SinglePhoto> allSinglePhotos = Arrays.asList(response.getBody().as(SinglePhoto[].class));

		AllPhotos allPhotos = new AllPhotos();
		allPhotos.setListOfPhotos(allSinglePhotos);

		System.out.println(allPhotos.toString());
		return allPhotos;
	}
	
	
}
