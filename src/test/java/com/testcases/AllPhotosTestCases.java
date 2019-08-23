package com.testcases;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.businesslayer.AllPhotosBusinessLogic;
import com.pojos.AllPhotos;
import com.pojos.SinglePhoto;

/**
 * This class does not required data provider as we are hitting base api without any parameters
 * 
 * @author Sheetal Singh
 */
public class AllPhotosTestCases {

	@Test
	public void testAll() {
		AllPhotos allPhotos = AllPhotosBusinessLogic.getAllPhotos();

		List<SinglePhoto> allSinglePhotos = allPhotos.getListOfPhotos();
		Assert.assertEquals(allSinglePhotos.size(), 5000);

		// group all photos as per album id
		Stream<SinglePhoto> streamOfPhotos = allSinglePhotos.stream();
		Map<String, List<SinglePhoto>> mapOfAlbums = streamOfPhotos
				.collect(Collectors.groupingBy(x -> ((SinglePhoto) x).getAlbumId()));
		Assert.assertEquals(mapOfAlbums.size(), 100);
	}

}
