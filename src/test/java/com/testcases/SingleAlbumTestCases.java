package com.testcases;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.businesslayer.AllPhotosBusinessLogic;
import com.data.DataProviderClass;
import com.data.pojos.TestDataForAlbumApi;
import com.pojos.AllPhotos;
import com.pojos.SinglePhoto;

/**
 * @author Sheetal Singh
 */
public class SingleAlbumTestCases {

	@Test(dataProvider = "AlbumApiObjSet1", dataProviderClass = DataProviderClass.class)
	public void testSetOfPhotosForAlbumId(TestDataForAlbumApi testDataForAlbumApi) {
		String albumId = testDataForAlbumApi.getAlbumID();
		AllPhotos allPhotosForAlbumId = AllPhotosBusinessLogic.getAllPhotosForAlbumId(albumId);
		List<SinglePhoto> allPhotosList = allPhotosForAlbumId.getListOfPhotos();
		Assert.assertEquals(allPhotosList.size(), 50);
	}

	@Test(dataProvider = "AlbumApiObjSet1", dataProviderClass = DataProviderClass.class)
	public void testListOfElementsInParticularAlbumId(TestDataForAlbumApi testDataForAlbumApi) {
		List<String> listOfAlbumIds = AllPhotosBusinessLogic
				.getListOfElementsFromAlbumId(testDataForAlbumApi.getAlbumID(), "id");
		Assert.assertEquals(listOfAlbumIds.size(), 50);

		List<String> listOfTitle = AllPhotosBusinessLogic.getListOfElementsFromAlbumId(testDataForAlbumApi.getAlbumID(),
				"title");
		Assert.assertEquals(listOfTitle.size(), 50);

		List<String> listOfURL = AllPhotosBusinessLogic.getListOfElementsFromAlbumId(testDataForAlbumApi.getAlbumID(),
				"url");
		Assert.assertEquals(listOfURL.size(), 50);
	}

}
