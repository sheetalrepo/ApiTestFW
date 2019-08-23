package com.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.yaml.snakeyaml.Yaml;
import com.data.yaml.YamlTestDataBaseClassForAPI1;
import com.data.yaml.YamlTestDataBaseClassForAPI2;
import com.data.yaml.YamlTestDataForAPI1;
import com.data.yaml.YamlTestDataForAPI2;


/**
 * In this design for every @test method we have different api with same name
 * On runtime we fetch api data using Reflection
 * 
 * @author Sheetal Singh (https://www.youtube.com/user/MrQwerty8080/playlists?view_as=subscriber)
 */
public class DataProviderClass {

	/**
	 * This method will return dynamic test data file path as per class and test case name
	 */
	private static String getTestDataFilePath(Method method) {
		// Fetch ClassName
		String className = method.getName().split("_")[0]; // fetch class name
		System.out.println("ClassName:" + className);

		// Fetch Method Name
		String methodName = method.getName().split("_")[1]; // fetch method name
		System.out.println("MethodName:" + methodName);

		String jsonPath = ".\\src\\test\\resources\\testdata\\" + className + "\\" + methodName + ".yaml";
		return jsonPath;
	}
	
	
	//-----------------------------------------------  API1  ----------------------------------------------------------------------// 

	/**
	 *  Yaml Reader For API1
	 */
	public static YamlTestDataBaseClassForAPI1 fetchYamlIntoPojos1(String yamlPath) {
		Yaml yaml = new Yaml();
		YamlTestDataBaseClassForAPI1 yamlTestDataBaseClassForAPI1 = null; 
		try {
			yamlTestDataBaseClassForAPI1 = yaml.loadAs(new FileReader(new File(yamlPath)), YamlTestDataBaseClassForAPI1.class);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(">>"+yamlTestDataBaseClassForAPI1);
		return yamlTestDataBaseClassForAPI1;
	}
	
	
	/**
	 * API1 (Single Photo) Data Provider
	 */
	@DataProvider(name = "YamlInfinityAPI1")
	public static Iterator<YamlTestDataForAPI1> getYamlInfinityData1(Method method) {

		String yamlPath = getTestDataFilePath(method);
		System.out.println("### YAML Path 1: " + yamlPath);
		
		YamlTestDataBaseClassForAPI1 yamlTestDataBaseClassForAPI1 =  fetchYamlIntoPojos1(yamlPath);
		
		List<YamlTestDataForAPI1> listOfData = yamlTestDataBaseClassForAPI1.getYamlTestDataForAPI1();
		return listOfData.iterator();
	}
	
	
	
	
	
	
	
	
	//-----------------------------------------------  API2  ----------------------------------------------------------------------//	
	/**
	 *  Yaml Reader For API2
	 */
	public static YamlTestDataBaseClassForAPI2 fetchYamlIntoPojos2(String yamlPath) {
		Yaml yaml = new Yaml();
		YamlTestDataBaseClassForAPI2 yamlTestDataBaseClassForAPI2 = null; 
		try {
			yamlTestDataBaseClassForAPI2 = yaml.loadAs(new FileReader(new File(yamlPath)), YamlTestDataBaseClassForAPI2.class);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(">>"+yamlTestDataBaseClassForAPI2);
		return yamlTestDataBaseClassForAPI2;
	}
	
	
	/**
	 * API2 (Single Album) Data Provider
	 */
	@DataProvider(name = "YamlInfinityAPI2")
	public static Iterator<YamlTestDataForAPI2> getYamlInfinityData2(Method method) {

		String yamlPath = getTestDataFilePath(method);
		System.out.println("### YAML Path 1: " + yamlPath);
		
		YamlTestDataBaseClassForAPI2 yamlTestDataBaseClassForAPI2 =  fetchYamlIntoPojos2(yamlPath);
		
		List<YamlTestDataForAPI2> listOfData = yamlTestDataBaseClassForAPI2.getYamlTestDataForAPI2();
		return listOfData.iterator();
	}
	
	
	@DataProvider(name="testData")
	public Object[][] getDataFromYamlFile(Method method)
	{
		Yaml yaml = new Yaml();
		AllTestCaseData allTestCaseData = null; 
		
		//String yamlPath = getTestDataFilePath(method);
		try {
			allTestCaseData = yaml.loadAs(new FileReader(new File("TestDataInYaml.yml")), AllTestCaseData.class);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String testCaseName = method.getName();
		List<TestData> testDataSets = allTestCaseData.getAllTestCaseDataMap().get(testCaseName);
		Object[][] data = new Object[testDataSets.size()][1];
		
		for (int i = 0; i < testDataSets.size(); i++) {
			data[i][0] = testDataSets.get(i);
		}
	
		return data;
	}
	
	
}
