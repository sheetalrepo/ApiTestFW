package com.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
//import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.DataProvider;
import org.yaml.snakeyaml.Yaml;

import com.data.yaml.AllTestCaseData;
import com.data.yaml.TestData;

/**
 * Here we have single DP method for any type of data present in all_test_data.yaml
 * 
 * @author Sheetal Singh (https://www.youtube.com/user/MrQwerty8080/playlists?view_as=subscriber)
 */
public class DataProviderClass {


	@DataProvider(name="common_test_data_provider")
	public Object[][] getDataFromYamlFile(Method method)
	{
		Yaml yaml = new Yaml();
		AllTestCaseData allTestCaseData = null; 
		String testCasePath = ".\\src\\test\\resources\\testdata\\all_test_data.yaml";
		
		
		try {
			allTestCaseData = yaml.loadAs(new FileReader(new File(testCasePath)), AllTestCaseData.class);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String testCaseName = method.getName();
		List<TestData> testDataSets = allTestCaseData.getAllTestCaseDataMap().get(testCaseName);  //list will be specific for @test method
		
		//Filter test data based on test category to be run i.e. smoke, sanity and reg  
		String casesToBeRun = PropertyFileReader.getPropertyData().getApis().get("cases_to_be_run");
		System.out.println("********** CASES TO BE RUN : "+casesToBeRun+" **********");
		testDataSets = testDataSets.stream()
				.filter(x -> casesToBeRun.equalsIgnoreCase(x.getTestCategory()))
				.collect(Collectors.toList());
				
		
		Object[][] data = new Object[testDataSets.size()][1]; //on runtime, rows will be decided, column will always be 1 in all the cases
		
		//on runtime Object[n][1] array will be populated based on list size
		for (int i = 0; i < testDataSets.size(); i++) {
			data[i][0] = testDataSets.get(i);
		}
	
		return data;
	}
	
	
}
