package com.businesslayer;

import static io.restassured.RestAssured.when;
import static io.restassured.path.json.JsonPath.from;

import org.apache.log4j.Logger;

import com.data.PropertyFileReader;
import com.pojos.SinglePhoto;
import io.restassured.response.Response;

/**
 * Business Layer : Sole purpose is to accept data and populate POJOs and
 * further perform some task related to particular domain
 * 
 * This class will contains all logic related to API http://<domain>/photos/<id>
 * 
 * @author Sheetal Singh
 * https://www.youtube.com/user/MrQwerty8080/playlists?view_as=subscriber
 */
public class SinglePhotoBusinessLogic {
	private static final Logger LOGGER = Logger.getLogger(SinglePhotoBusinessLogic.class);

	/*
	 * Extract data as Response object
	 * Populate respective Response POJOs
	 */
	public static SinglePhoto getSinglePhotoDataFor(String id) {
		String baseURL = PropertyFileReader.getPropertyData().getApis().get("homeurl");
		String photos = PropertyFileReader.getPropertyData().getApis().get("photos");
		String url = baseURL + photos + "/" + id;
		LOGGER.info("URL to be hit:" + url);

		Response response = when().get(url);
		SinglePhoto singlePhoto = response.getBody().as(SinglePhoto.class);
		LOGGER.info("URL to be hit:" + singlePhoto);
		return singlePhoto;
	}

	/*
	 * Extract data as String/JsonPath
	 * 
	 * Note: This method is same as above method. Just that we are using JsonPath
	 * feature to extract data This is a bit lengthy compared to above
	 */
	public static SinglePhoto getSinglePhotoDataForUsingString(String id) {
		String baseURL = PropertyFileReader.getPropertyData().getApis().get("homeurl");
		String photos = PropertyFileReader.getPropertyData().getApis().get("photos");
		String url = baseURL + photos + "/" + id;
		LOGGER.info("URL to be hit:" + url);

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
