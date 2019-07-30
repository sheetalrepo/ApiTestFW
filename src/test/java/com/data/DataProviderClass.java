package com.data;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import org.testng.annotations.DataProvider;
import com.data.json.CompleteJsonTestDataForAPI1;
import com.data.json.CompleteJsonTestDataForAPI2;
import com.data.json.JsonTestDataForAPI1;
import com.data.json.JsonTestDataForAPI2;
import com.google.gson.Gson;

/**
 * In this design for every @test method we have different json with same name
 * On runtime we fetch json data using Reflection
 * Json read as JsonTestDataForAPIX pojo and later converted into JSONTestDataAPIX
 * Iterator of JsonTestDataForAPI1X class sent to @test method
 * 
 * @author Sheetal Singh (https://www.youtube.com/user/MrQwerty8080/playlists?view_as=subscriber)
 */
public class DataProviderClass {

	/**
	 * This method will return dynamic JSON path as per class and test case name
	 */
	private static String getJsonFilePath(Method method) {
		// Fetch ClassName
		String className = method.getName().split("_")[0]; // fetch class name
		System.out.println("ClassName:" + className);

		// Fetch Method Name
		String methodName = method.getName().split("_")[1]; // fetch method name
		System.out.println("MethodName:" + methodName);

		String jsonPath = ".\\src\\test\\resources\\testdata\\" + className + "\\" + methodName + ".json";
		return jsonPath;
	}

	/**
	 * This method will read respective json and convert it into respective POJO
	 * 
	 * Note: For every new API this method will be different
	 * This is for API 1 i.e. Single Photo API
	 */
	public static CompleteJsonTestDataForAPI1 fetchJSONIntoPojos1(String jsonPath) {
		Gson gson = new Gson();
		CompleteJsonTestDataForAPI1 jsonTestData = null;

		try (Reader reader = new FileReader(jsonPath)) {
			jsonTestData = gson.fromJson(reader, CompleteJsonTestDataForAPI1.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonTestData;
	}

	/**
	 * Same as above, its for API2 - Album API
	 */
	public static CompleteJsonTestDataForAPI2 fetchJSONIntoPojos2(String jsonPath) {
		Gson gson = new Gson();
		CompleteJsonTestDataForAPI2 jsonTestData = null;

		try (Reader reader = new FileReader(jsonPath)) {
			jsonTestData = gson.fromJson(reader, CompleteJsonTestDataForAPI2.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return jsonTestData;
	}

	
	/**
	 * API1 (Single Photo) Data Provider
	 */
	@DataProvider(name = "Infinity1")
	public static Iterator<JsonTestDataForAPI1> getInfinityData1(Method method) {

		String jsonPath = getJsonFilePath(method);
		System.out.println("### JSON Path 1: " + jsonPath);

		CompleteJsonTestDataForAPI1 jsonDataForAPI1 = fetchJSONIntoPojos1(jsonPath);

		List<JsonTestDataForAPI1> listOfData = jsonDataForAPI1.getData();
		return listOfData.iterator();

	}

	
	/**
	 * API2 (Album) Data Provider
	 */
	@DataProvider(name = "Infinity2")
	public static Iterator<JsonTestDataForAPI2> getInfinityData2(Method method) {

		String jsonPath = getJsonFilePath(method);
		System.out.println("### JSON Path 2: " + jsonPath);

		CompleteJsonTestDataForAPI2 jsonDataForAPI2 = fetchJSONIntoPojos2(jsonPath);

		List<JsonTestDataForAPI2> listOfData = jsonDataForAPI2.getData();
		return listOfData.iterator();

	}

}
