package com.testcases;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.businesslayer.AllPhotosBusinessLogic;
import com.data.DataProviderClass;
import com.data.json.JsonTestDataForAPI2;
import com.pojos.AllPhotos;
import com.pojos.SinglePhoto;

/**
 * This class contains all the test cases related to API2 i.e. SingleAlbum API
 * 
 * Method name should start with class name; separated by underscore
 * This is to get class name and to make json path which is placed in folders having same structure as of classes and methods
 * e.g. /ApiTestFW/src/test/resources/testdata/className/methodName.json
 * 
 * @author Sheetal Singh
 */
public class SingleAlbumTestCases {

	@Test(dataProvider = "Infinity2", dataProviderClass = DataProviderClass.class)
	public void SingleAlbumTestCases_testSetOfPhotosForAlbumId(JsonTestDataForAPI2 apitestdata) {
		String albumId = apitestdata.getAlbumId();
		AllPhotos allPhotosForAlbumId = AllPhotosBusinessLogic.getAllPhotosForAlbumId(albumId);
		List<SinglePhoto> allPhotosList = allPhotosForAlbumId.getListOfPhotos();
		Assert.assertEquals(allPhotosList.size(), 50);
	}

	@Test(dataProvider = "Infinity2", dataProviderClass = DataProviderClass.class)
	public void SingleAlbumTestCases_testListOfElementsInParticularAlbumId(JsonTestDataForAPI2 apitestdata) {
		List<String> listOfAlbumIds = AllPhotosBusinessLogic.getListOfElementsFromAlbumId(apitestdata.getAlbumId(), "id");
		Assert.assertEquals(listOfAlbumIds.size(), 50);

		List<String> listOfTitle = AllPhotosBusinessLogic.getListOfElementsFromAlbumId(apitestdata.getAlbumId(),"title");
		Assert.assertEquals(listOfTitle.size(), 50);

		List<String> listOfURL = AllPhotosBusinessLogic.getListOfElementsFromAlbumId(apitestdata.getAlbumId(),"url");
		Assert.assertEquals(listOfURL.size(), 50);
	}
	
}
