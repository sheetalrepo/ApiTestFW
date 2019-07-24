package com.testcases;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.path.json.JsonPath.from;
import static org.hamcrest.Matchers.greaterThan;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.businesslayer.SinglePhotoBusinessLogic;
import com.data.DataProviderClass;
import com.data.pojos.TestDataForSinglePhotoApi;
import com.response.pojos.SinglePhoto;


public class SinglePhotosTestCases {

//	@Test(dataProvider="JsonDataProvider", dataProviderClass=DataProviderClass.class)
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


	
	
	@Test(dataProvider = "PhotoApiObjSet1", dataProviderClass = DataProviderClass.class)
	public void testSinglePhotoCase1(TestDataForSinglePhotoApi testDataForSinglePhotoApi) {
		//System.out.println(testDataForSinglePhotoApi.getTestCaseName()+" || "+testDataForSinglePhotoApi.getPhotoId()+" || "+testDataForSinglePhotoApi.getCategory());
		String id = testDataForSinglePhotoApi.getPhotoId();
		SinglePhoto singlePhotoActualData = SinglePhotoBusinessLogic.getSinglePhotoDataFor(id);
		System.out.println(singlePhotoActualData);

		Assert.assertEquals(singlePhotoActualData.getId(), id);
		Assert.assertEquals(singlePhotoActualData.getAlbumId(), "1");
		Assert.assertTrue(singlePhotoActualData.getUrl().startsWith("https://via.placeholder.com/600/"));
		Assert.assertTrue(singlePhotoActualData.getThumbnailUrl().startsWith("https://via.placeholder.com/150/"));
	}
	
	@Test(dataProvider = "PhotoApiSet1", dataProviderClass = DataProviderClass.class)
	public void testSinglePhotoCase1_Type2(String testCaseName, String id, String category) {
		System.out.println(testCaseName+" | "+id+" | "+category);
	}
	
	
	
	
	@Test(dataProvider = "PhotoApiObjSet2", dataProviderClass = DataProviderClass.class)
	public void testSinglePhotoCase2(TestDataForSinglePhotoApi testDataForSinglePhotoApi) {
		String id = testDataForSinglePhotoApi.getPhotoId();
		SinglePhoto singlePhotoActualData = SinglePhotoBusinessLogic.getSinglePhotoDataFor(id);
		System.out.println(singlePhotoActualData);

		Assert.assertEquals(singlePhotoActualData.getId(), id);
		Assert.assertEquals(singlePhotoActualData.getAlbumId(), "5");
		Assert.assertTrue(singlePhotoActualData.getUrl().startsWith("https://via.placeholder.com/600/"));
		Assert.assertTrue(singlePhotoActualData.getThumbnailUrl().startsWith("https://via.placeholder.com/150/"));
	}
	

}
