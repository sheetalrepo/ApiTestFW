package com.businesslayer;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;
import static io.restassured.path.json.JsonPath.from;

import java.util.Arrays;
import java.util.List;

import com.response.pojos.AllPhotos;
import com.response.pojos.SinglePhoto;

import io.restassured.response.Response;

/**
 * Business Layer : Sole purpose is to accept data and populate POJOs and
 * further perform some task related to particular domain
 * 
 * This class will contains all logic related to API http://<domain>/photos
 *
 */
public class AllPhotosBusinessLogic {

	// TODOs: read from property files
	static String baseUrl = "http://jsonplaceholder.typicode.com";

	/**
	 * Fetch list of all single element nodes (like id, albumID, title, thumbnailUrl
	 * etc) from response
	 */
	public static List<String> getListOfElementsFromAlbumId(String albumID, String elementName) {
		String url = baseUrl + "/photos/?albumId=" + albumID;
		System.out.println("URL to be hit: " + url);

		String albumResponseString = get(url).asString();
		List<String> listOfElements = from(albumResponseString).getList(elementName);
		return listOfElements;
	}

	/**
	 * Fetch list of all small json set respective to particular albumID
	 */
	public static AllPhotos getAllPhotosForAlbumId(String albumID) {
		String url = "http://jsonplaceholder.typicode.com/photos/?albumId=" + albumID;
		System.out.println("URL to be hit: " + url);

		Response response = when().get(url);
		List<SinglePhoto> allSinglePhotos = Arrays.asList(response.getBody().as(SinglePhoto[].class));

		AllPhotos allPhotos = new AllPhotos();
		allPhotos.setListOfPhotos(allSinglePhotos);
		return allPhotos;
	}

	/**
	 * Fetch list of all small json present inside main json irrespective of albumID
	 */
	public static AllPhotos getAllPhotos() {
		String url = "http://jsonplaceholder.typicode.com/photos";
		System.out.println("URL to be hit: " + url);

		Response response = when().get(url);
		List<SinglePhoto> allSinglePhotos = Arrays.asList(response.getBody().as(SinglePhoto[].class));

		AllPhotos allPhotos = new AllPhotos();
		allPhotos.setListOfPhotos(allSinglePhotos);

		System.out.println(allPhotos.toString());
		return allPhotos;
	}

}
