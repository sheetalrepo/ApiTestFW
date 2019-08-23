package com.testcases;

import java.util.List;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.businesslayer.AllPhotosBusinessLogic;
import com.data.DataProviderClass;
import com.data.yaml.YamlTestDataForAPI2;
import com.pojos.AllPhotos;
import com.pojos.SinglePhoto;

/**
 * This class contains all the test cases related to API2 i.e. SingleAlbum API
 * 
 * @author Sheetal Singh
 */
public class SingleAlbumTestCases {

	private static final Logger LOGGER = Logger.getLogger(SingleAlbumTestCases.class);

	
	
	@Test(dataProvider = "common_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void testSetOfPhotosForAlbumId(YamlTestDataForAPI2 apitestdata) {
		String albumId = apitestdata.getAlbumId();
		AllPhotos allPhotosForAlbumId = AllPhotosBusinessLogic.getAllPhotosForAlbumId(albumId);
		LOGGER.info(allPhotosForAlbumId);

		List<SinglePhoto> allPhotosList = allPhotosForAlbumId.getListOfPhotos();
		Assert.assertEquals(allPhotosList.size(), 50);
	}

	
	
	@Test(dataProvider = "common_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void testListOfElementsInParticularAlbumId(YamlTestDataForAPI2 apitestdata) {
		List<String> listOfAlbumIds = AllPhotosBusinessLogic.getListOfElementsFromAlbumId(apitestdata.getAlbumId(),"id");
		Assert.assertEquals(listOfAlbumIds.size(), 50);

		List<String> listOfTitle = AllPhotosBusinessLogic.getListOfElementsFromAlbumId(apitestdata.getAlbumId(),"title");
		Assert.assertEquals(listOfTitle.size(), 50);

		List<String> listOfURL = AllPhotosBusinessLogic.getListOfElementsFromAlbumId(apitestdata.getAlbumId(), "url");
		Assert.assertEquals(listOfURL.size(), 50);
	}

}
