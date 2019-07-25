package com.data;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import com.data.json.JSONTestData;
import com.data.json.JSONReader;
import com.data.json.VerifySingleAlbum1;
import com.data.json.VerifySinglePhoto1;
import com.data.json.VerifySinglePhoto2;
import com.data.pojos.TestDataForAlbumApi;
import com.data.pojos.TestDataForSinglePhotoApi;

/**
 * @author Sheetal Singh
 */
public class PopulateTestCasesPOJOs {
	// TODOs: method code is similar and can to be merged

	/**
	 * This method will read sample test data i.e. "Set 1" list for particular API
	 * from input TestData.json And populate respective POJOs e.g.
	 * TestDataForSinglePhotoApi
	 * 
	 * Pls note multiple Sets in input json i.e. Set1, Set2 may map to single POJOs
	 * class TestDataForSinglePhotoApi.java
	 */
	public static List<TestDataForSinglePhotoApi> getSinglePhotoDataSet1() {
		JSONTestData jsonTestData = JSONReader.fetchJSONIntoPojos();

		List<VerifySinglePhoto1> lsVerifySinglePhoto1 = jsonTestData.getVerifySinglePhoto1();
		// System.out.println("JSON List for VerifySinglePhoto1 : "+
		// lsVerifySinglePhoto1);

		List<TestDataForSinglePhotoApi> listTestDataForSinglePhotoApi = new ArrayList<>();
		for (VerifySinglePhoto1 verifySinglePhoto1 : lsVerifySinglePhoto1) {
			TestDataForSinglePhotoApi testDataForSinglePhotoApi = new TestDataForSinglePhotoApi();
			testDataForSinglePhotoApi.setPhotoId(verifySinglePhoto1.getPhotoId());
			testDataForSinglePhotoApi.setCategory(verifySinglePhoto1.getCategory());
			String classNameRaw = verifySinglePhoto1.getClass().getName();
			String className = StringUtils.substringAfterLast(classNameRaw, ".");
			testDataForSinglePhotoApi.setTestCaseName(className);
			listTestDataForSinglePhotoApi.add(testDataForSinglePhotoApi);
		}

		// System.out.println("POJO List for TestDataForSinglePhotoApi : "+
		// listTestDataForSinglePhotoApi);
		return listTestDataForSinglePhotoApi;
	}
	
	

	/**
	 * This method will read sample test data i.e. "Set 2" list for particular API
	 * from input TestData.json And populate respective POJOs e.g.
	 * TestDataForSinglePhotoApi
	 * 
	 * Pls note Set 2 in input json is also corresponds to same API i.e.
	 * TestDataForSinglePhotoApi
	 */
	public static List<TestDataForSinglePhotoApi> getSinglePhotoDataSet2() {
		JSONTestData jsonTestData = JSONReader.fetchJSONIntoPojos(); // TODOs: remove duplicate code

		List<VerifySinglePhoto2> lsVerifySinglePhoto2 = jsonTestData.getVerifySinglePhoto2();
		// System.out.println("JSON List for VerifySinglePhoto2 : "+
		// lsVerifySinglePhoto2);

		List<TestDataForSinglePhotoApi> listTestDataForSinglePhotoApi = new ArrayList<>();
		for (VerifySinglePhoto2 verifySinglePhoto2 : lsVerifySinglePhoto2) {
			TestDataForSinglePhotoApi testDataForSinglePhotoApi = new TestDataForSinglePhotoApi();
			testDataForSinglePhotoApi.setPhotoId(verifySinglePhoto2.getPhotoId());
			testDataForSinglePhotoApi.setCategory(verifySinglePhoto2.getCategory());
			String classNameRaw = verifySinglePhoto2.getClass().getName();
			String className = StringUtils.substringAfterLast(classNameRaw, ".");
			testDataForSinglePhotoApi.setTestCaseName(className);
			listTestDataForSinglePhotoApi.add(testDataForSinglePhotoApi);
		}

		// System.out.println("POJO List for TestDataForSinglePhotoApi : "+
		// listTestDataForSinglePhotoApi);
		return listTestDataForSinglePhotoApi;
	}

	
	
	/**
	 * This method will read sample test data i.e. "Set 3" list for particular API
	 * from input TestData.json And populate respective POJOs e.g.
	 * TestDataForAlbumApi
	 * 
	 */
	public static List<TestDataForAlbumApi> getSingleAlbumDataSet1() {
		JSONTestData jsonTestData = JSONReader.fetchJSONIntoPojos(); // TODOs: remove duplicate code

		List<VerifySingleAlbum1> lsVerifySingleAlbum1 = jsonTestData.getVerifySingleAlbum1();
		// System.out.println("JSON List for VerifySingleAlbum1 : "+
		// lsVerifySingleAlbum1);

		List<TestDataForAlbumApi> listTestDataForAlbumApi = new ArrayList<>();
		for (VerifySingleAlbum1 verifySingleAlbum1 : lsVerifySingleAlbum1) {
			TestDataForAlbumApi testDataForAlbumApi = new TestDataForAlbumApi();
			testDataForAlbumApi.setAlbumID(verifySingleAlbum1.getAlbumId());
			testDataForAlbumApi.setCategory(verifySingleAlbum1.getCategory());
			String classNameRaw = verifySingleAlbum1.getClass().getName();
			String className = StringUtils.substringAfterLast(classNameRaw, ".");
			testDataForAlbumApi.setTestCaseName(className);
			listTestDataForAlbumApi.add(testDataForAlbumApi);
		}

		// System.out.println("POJO List for TestDataForAlbumApi : "+
		// listTestDataForAlbumApi);
		return listTestDataForAlbumApi;
	}
}
