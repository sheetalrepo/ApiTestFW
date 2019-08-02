package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.businesslayer.SinglePhotoBusinessLogic;
import com.data.DataProviderClass;
import com.data.json.JsonTestDataForAPI1;
import com.data.json.YamlTestDataForAPI1;
import com.pojos.SinglePhoto;
import org.apache.log4j.Logger;

/**
 * This class contains all the test cases related to API1 i.e. SinglePhoto API
 * 
 * Method name should start with class name; separated by underscore
 * This is to get class name and to make json path which is placed in folders having same structure as of classes and methods
 * e.g. /ApiTestFW/src/test/resources/testdata/className/methodName.json
 * 
 * @author Sheetal Singh
 */
public class SinglePhotosTestCases {

	private static final Logger LOGGER = Logger.getLogger(SinglePhotosTestCases.class);

	
	@Test(dataProvider = "YamlInfinity1", dataProviderClass = DataProviderClass.class)
	public void SinglePhotosTestCases_testSinglePhotoCase1(YamlTestDataForAPI1 apitestdata) {
		String id = apitestdata.getPhotoId();
		SinglePhoto singlePhotoActualData = SinglePhotoBusinessLogic.getSinglePhotoDataFor(id);
		LOGGER.info(singlePhotoActualData);
		
		Assert.assertEquals(singlePhotoActualData.getId(), id);
		Assert.assertEquals(singlePhotoActualData.getAlbumId(), "1");
		Assert.assertTrue(singlePhotoActualData.getUrl().startsWith("https://via.placeholder.com/600/"));
		Assert.assertTrue(singlePhotoActualData.getThumbnailUrl().startsWith("https://via.placeholder.com/150/"));
	}

	
	
//	@Test(dataProvider = "Infinity1", dataProviderClass = DataProviderClass.class)
//	public void SinglePhotosTestCases_testSinglePhotoCase1(JsonTestDataForAPI1 apitestdata) {
//		String id = apitestdata.getPhotoId();
//		SinglePhoto singlePhotoActualData = SinglePhotoBusinessLogic.getSinglePhotoDataFor(id);
//		LOGGER.info(singlePhotoActualData);
//		
//		Assert.assertEquals(singlePhotoActualData.getId(), id);
//		Assert.assertEquals(singlePhotoActualData.getAlbumId(), "1");
//		Assert.assertTrue(singlePhotoActualData.getUrl().startsWith("https://via.placeholder.com/600/"));
//		Assert.assertTrue(singlePhotoActualData.getThumbnailUrl().startsWith("https://via.placeholder.com/150/"));
//	}
//
//	@Test(dataProvider = "Infinity1", dataProviderClass = DataProviderClass.class)
//	public void SinglePhotosTestCases_testSinglePhotoCase2(JsonTestDataForAPI1 apitestdata) {
//		String id = apitestdata.getPhotoId();
//		SinglePhoto singlePhotoActualData = SinglePhotoBusinessLogic.getSinglePhotoDataFor(id);
//		LOGGER.info(singlePhotoActualData);
//
//		Assert.assertEquals(singlePhotoActualData.getId(), id);
//		Assert.assertEquals(singlePhotoActualData.getAlbumId(), "5");
//		Assert.assertTrue(singlePhotoActualData.getUrl().startsWith("https://via.placeholder.com/600/"));
//		Assert.assertTrue(singlePhotoActualData.getThumbnailUrl().startsWith("https://via.placeholder.com/150/"));
//	}
}
