package com.data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import com.data.yaml.YamlTestDataForAPI1;
import com.data.yaml.YamlTestDataForAPI2;

public class YamlWriter {
	
	public static void main(String[] args) throws IOException {
		Yaml yaml = new Yaml();
		AllTestCaseData obj = new AllTestCaseData();
		List<TestData> lst1= new ArrayList<TestData>();
		List<TestData> lst2= new ArrayList<TestData>();
		 
		Map<String, List<TestData>> testCaseData = new LinkedHashMap<String, List<TestData>>();
		
		lst1.add(new YamlTestDataForAPI1());
		lst1.add(new YamlTestDataForAPI1());
		
		lst2.add(new YamlTestDataForAPI2());
		lst2.add(new YamlTestDataForAPI2());
		
		testCaseData.put("testSinglePhotoCase1", lst1);
		testCaseData.put("testSinglePhotoCase2", lst2);
		
		obj.setAllTestCaseDataMap(testCaseData);
		
		yaml.dump(obj, new FileWriter(new File("TestDataInYaml.yml")));
	}

}
