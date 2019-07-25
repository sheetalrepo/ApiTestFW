package com.data;

import java.util.List;
import org.testng.annotations.DataProvider;
import com.data.pojos.TestDataForAlbumApi;
import com.data.pojos.TestDataForSinglePhotoApi;

/**
 * DataProvider class will take data from TestDataBaseClass's POJOs
 * TestDataBaseClass's pojos can be populated using json, csv, excel etc
 * 
 * In this design for every row in testdata.json we are creating a separate DataProvider
 * 
 * @author Sheetal Singh
 * https://www.youtube.com/user/MrQwerty8080/playlists?view_as=subscriber
 */
public class DataProviderClass {

	/**
	 * Row 1 Data(Type 1)
	 * 
	 * This will read only first row from testdata.json
	 */
	@DataProvider(name = "PhotoApiObjSet1")
	public static Object[] getPhotosAPIDataSet1Obj() {
		Object data[] = new Object[3];
		List<TestDataForSinglePhotoApi> list = PopulateTestCasesPOJOs.getSinglePhotoDataSet1();
		TestDataForSinglePhotoApi case1 = list.get(0);

		data[0] = case1;
		data[1] = list.get(1);
		data[2] = list.get(2);

		return data;
	}

	// Duplicate of above method (Type 2)
	@DataProvider(name = "PhotoApiSet1")
	public static Object[][] getPhotosAPIDataSet1() {

		Object data[][] = new Object[3][3];
		data[0][0] = PopulateTestCasesPOJOs.getSinglePhotoDataSet1().get(0).getTestCaseName();
		data[0][1] = PopulateTestCasesPOJOs.getSinglePhotoDataSet1().get(0).getPhotoId();
		data[0][2] = PopulateTestCasesPOJOs.getSinglePhotoDataSet1().get(0).getCategory();

		data[1][0] = PopulateTestCasesPOJOs.getSinglePhotoDataSet1().get(1).getTestCaseName();
		data[1][1] = PopulateTestCasesPOJOs.getSinglePhotoDataSet1().get(1).getPhotoId();
		data[1][2] = PopulateTestCasesPOJOs.getSinglePhotoDataSet1().get(1).getCategory();

		data[2][0] = PopulateTestCasesPOJOs.getSinglePhotoDataSet1().get(2).getTestCaseName();
		data[2][1] = PopulateTestCasesPOJOs.getSinglePhotoDataSet1().get(2).getPhotoId();
		data[2][2] = PopulateTestCasesPOJOs.getSinglePhotoDataSet1().get(2).getCategory();

		return data;
	}

	/**
	 * Row 2 Data It will read second row from testdata.json, as second row has only
	 * two key val pair hence will create array with size two
	 */
	@DataProvider(name = "PhotoApiObjSet2")
	public static Object[] getPhotosAPIDataSet2Obj() {
		Object data[] = new Object[2];
		List<TestDataForSinglePhotoApi> list = PopulateTestCasesPOJOs.getSinglePhotoDataSet2();
		data[0] = list.get(0);
		data[1] = list.get(1);
		return data;
	}

	/**
	 * Row 3 Data It is related to Album Data
	 */
	@DataProvider(name = "AlbumApiObjSet1")
	public static Object[] getAlbumAPIDataSet1Obj() {
		Object data[] = new Object[2];
		List<TestDataForAlbumApi> list = PopulateTestCasesPOJOs.getSingleAlbumDataSet1();
		data[0] = list.get(0);
		data[1] = list.get(1);
		return data;
	}

}
