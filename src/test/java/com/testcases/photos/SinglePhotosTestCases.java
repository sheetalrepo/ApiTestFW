package com.testcases.photos;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.path.json.JsonPath.from;
import static org.hamcrest.Matchers.greaterThan;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.businesslayer.SinglePhotoBusinessLogic;
import com.data.helper.TestDataProvider;
import com.data.pojos.SinglePhoto;

public class SinglePhotosTestCases {

//	@Test(dataProvider="JsonDataProvider", dataProviderClass=TestDataProvider.class)
//	public void testSinglePhoto1(SinglePhoto photoId) {
//		System.out.println(String.format("Test for Id %s", photoId));
//
//		SinglePhoto singlePhoto = TestDataProvider.getSinglePhotoDataFor(photoId.getId());
//		System.out.println(singlePhoto);
//
//		Assert.assertEquals(singlePhoto.getId(), "5");
//		Assert.assertEquals(singlePhoto.getAlbumId(), "1");
//		Assert.assertTrue(singlePhoto.getTitle().contains("omnis"));
//		Assert.assertTrue(singlePhoto.getUrl().startsWith("https://via.placeholder.com/600/"));
//		Assert.assertTrue(singlePhoto.getThumbnailUrl().startsWith("https://via.placeholder.com/150/"));
//	}
//	

//	@Test(dataProvider="JsonDataProvider", dataProviderClass=TestDataProvider.class)
//	public void testSinglePhoto1(SinglePhoto photoId) {
//		System.out.println(String.format("Test for Id %s", photoId));
//
//		SinglePhoto singlePhoto = SinglePhotoBusinessLogic.getSinglePhotoDataFor(photoId.getId());
//		System.out.println(singlePhoto);
//
//		Assert.assertEquals(singlePhoto.getId(), "5");
//		Assert.assertEquals(singlePhoto.getAlbumId(), "1");
//		Assert.assertTrue(singlePhoto.getTitle().contains("omnis"));
//		Assert.assertTrue(singlePhoto.getUrl().startsWith("https://via.placeholder.com/600/"));
//		Assert.assertTrue(singlePhoto.getThumbnailUrl().startsWith("https://via.placeholder.com/150/"));
//	}

	@Test
	public void testSinglePhotoCase1() {
		SinglePhoto singlePhoto = SinglePhotoBusinessLogic.getSinglePhotoDataFor("8");
		System.out.println(singlePhoto);

		Assert.assertEquals(singlePhoto.getId(), "8");
		Assert.assertEquals(singlePhoto.getAlbumId(), "1");
		Assert.assertTrue(singlePhoto.getUrl().startsWith("https://via.placeholder.com/600/"));
		Assert.assertTrue(singlePhoto.getThumbnailUrl().startsWith("https://via.placeholder.com/150/"));
	}

	@Test
	public void testSinglePhotoCase2() {
		SinglePhoto singlePhoto = SinglePhotoBusinessLogic.getSinglePhotoDataForUsingString("5");
		System.out.println(singlePhoto);

		Assert.assertEquals(singlePhoto.getId(), "5");
		Assert.assertEquals(singlePhoto.getAlbumId(), "1");
		Assert.assertTrue(singlePhoto.getUrl().startsWith("https://via.placeholder.com/600/"));
		Assert.assertTrue(singlePhoto.getThumbnailUrl().startsWith("https://via.placeholder.com/150/"));
	}

}
