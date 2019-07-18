package com.testcases.photos;


import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.businesslayer.AllPhotosBusinessLogic;
import com.data.pojos.AllPhotos;
import com.data.pojos.SinglePhoto;

public class SingleAlbumTestCases {

	@Test
	public void testListOfElementsInParticularAlbumId() {
		List<String> listOfAlbumIds = AllPhotosBusinessLogic.getListOfElementsFromAlbumId("10", "id");
		Assert.assertEquals(listOfAlbumIds.size(), 50);

		List<String> listOfTitle = AllPhotosBusinessLogic.getListOfElementsFromAlbumId("10", "title");
		Assert.assertEquals(listOfTitle.size(), 50);

		List<String> listOfURL = AllPhotosBusinessLogic.getListOfElementsFromAlbumId("10", "url");
		Assert.assertEquals(listOfURL.size(), 50);
	}

	
	@Test
	public void testSetOfPhotosForAlbumId() {
		AllPhotos allPhotosForAlbumId = AllPhotosBusinessLogic.getAllPhotosForAlbumId("30");
		List<SinglePhoto> allPhotosList = allPhotosForAlbumId.getListOfPhotos();
		Assert.assertEquals(allPhotosList.size(), 50);
	}

}
