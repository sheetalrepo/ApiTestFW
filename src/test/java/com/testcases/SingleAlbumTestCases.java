package com.testcases;

import java.util.List;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.businesslayer.AllPhotosBusinessLogic;
import com.businesslayer.SinglePhotoBusinessLogic;
import com.data.DataProviderClass;
import com.data.pojos.TestDataForAlbumApi;
import com.response.pojos.AllPhotos;
import com.response.pojos.SinglePhoto;

public class SingleAlbumTestCases {

	
//	@Test
//	public void testSetOfPhotosForAlbumId() {
//		AllPhotos allPhotosForAlbumId = AllPhotosBusinessLogic.getAllPhotosForAlbumId("30");
//		List<SinglePhoto> allPhotosList = allPhotosForAlbumId.getListOfPhotos();
//		Assert.assertEquals(allPhotosList.size(), 50);
//	}
//
//	@Test
//	public void testListOfElementsInParticularAlbumId1() {
//		List<String> listOfAlbumIds = AllPhotosBusinessLogic.getListOfElementsFromAlbumId("10", "id");
//		Assert.assertEquals(listOfAlbumIds.size(), 50);
//
//		List<String> listOfTitle = AllPhotosBusinessLogic.getListOfElementsFromAlbumId("10", "title");
//		Assert.assertEquals(listOfTitle.size(), 50);
//
//		List<String> listOfURL = AllPhotosBusinessLogic.getListOfElementsFromAlbumId("10", "url");
//		Assert.assertEquals(listOfURL.size(), 50);
//	}

	
	
	@Test(dataProvider = "AlbumApiObjSet1", dataProviderClass = DataProviderClass.class)
	public void testSetOfPhotosForAlbumId(TestDataForAlbumApi testDataForAlbumApi) {
		String albumId = testDataForAlbumApi.getAlbumID();
		AllPhotos allPhotosForAlbumId = AllPhotosBusinessLogic.getAllPhotosForAlbumId(albumId);
		List<SinglePhoto> allPhotosList = allPhotosForAlbumId.getListOfPhotos();
		Assert.assertEquals(allPhotosList.size(), 50);
	}

	
	
	@Test(dataProvider = "AlbumApiObjSet1", dataProviderClass = DataProviderClass.class)
	public void testListOfElementsInParticularAlbumId(TestDataForAlbumApi testDataForAlbumApi) {
		List<String> listOfAlbumIds = AllPhotosBusinessLogic.getListOfElementsFromAlbumId(testDataForAlbumApi.getAlbumID(), "id");
		Assert.assertEquals(listOfAlbumIds.size(), 50);

		List<String> listOfTitle = AllPhotosBusinessLogic.getListOfElementsFromAlbumId(testDataForAlbumApi.getAlbumID(), "title");
		Assert.assertEquals(listOfTitle.size(), 50);

		List<String> listOfURL = AllPhotosBusinessLogic.getListOfElementsFromAlbumId(testDataForAlbumApi.getAlbumID(), "url");
		Assert.assertEquals(listOfURL.size(), 50);
	}

}
