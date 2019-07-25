package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.businesslayer.SinglePhotoBusinessLogic;
import com.data.DataProviderClass;
import com.data.pojos.TestDataForSinglePhotoApi;
import com.pojos.SinglePhoto;

import org.apache.log4j.Logger;

/**
 * @author Sheetal Singh
 */
public class SinglePhotosTestCases {

	private static final Logger LOGGER = Logger.getLogger(SinglePhotosTestCases.class);

	@Test(dataProvider = "PhotoApiObjSet1", dataProviderClass = DataProviderClass.class)
	public void testSinglePhotoCase1(TestDataForSinglePhotoApi testDataForSinglePhotoApi) {
		String id = testDataForSinglePhotoApi.getPhotoId();
		SinglePhoto singlePhotoActualData = SinglePhotoBusinessLogic.getSinglePhotoDataFor(id);
		LOGGER.info(singlePhotoActualData);
		Assert.assertEquals(singlePhotoActualData.getId(), id);
		Assert.assertEquals(singlePhotoActualData.getAlbumId(), "1");
		Assert.assertTrue(singlePhotoActualData.getUrl().startsWith("https://via.placeholder.com/600/"));
		Assert.assertTrue(singlePhotoActualData.getThumbnailUrl().startsWith("https://via.placeholder.com/150/"));
	}

	@Test(dataProvider = "PhotoApiSet1", dataProviderClass = DataProviderClass.class)
	public void testSinglePhotoCase1_Type2(String testCaseName, String id, String category) {
		LOGGER.info(testCaseName + " | " + id + " | " + category);

	}

	@Test(dataProvider = "PhotoApiObjSet2", dataProviderClass = DataProviderClass.class)
	public void testSinglePhotoCase2(TestDataForSinglePhotoApi testDataForSinglePhotoApi) {
		String id = testDataForSinglePhotoApi.getPhotoId();
		SinglePhoto singlePhotoActualData = SinglePhotoBusinessLogic.getSinglePhotoDataFor(id);
		LOGGER.info(singlePhotoActualData);

		Assert.assertEquals(singlePhotoActualData.getId(), id);
		Assert.assertEquals(singlePhotoActualData.getAlbumId(), "5");
		Assert.assertTrue(singlePhotoActualData.getUrl().startsWith("https://via.placeholder.com/600/"));
		Assert.assertTrue(singlePhotoActualData.getThumbnailUrl().startsWith("https://via.placeholder.com/150/"));
	}

}
