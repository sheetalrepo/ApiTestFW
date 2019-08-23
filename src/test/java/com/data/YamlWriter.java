package com.data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import com.data.yaml.AllTestCaseData;
import com.data.yaml.TestData;
import com.data.yaml.YamlTestDataForAPI1;
import com.data.yaml.YamlTestDataForAPI2;


/**
 * Ignore this class: not part of Framework
 *
 * This is used to setup initial Yaml File Format i.e. all_test_data.yaml
 * Yaml can be created manually also
 */
public class YamlWriter {
	
	public static void main(String[] args) throws IOException {
		Yaml yaml = new Yaml();
		
		AllTestCaseData obj = new AllTestCaseData();
		List<TestData> lst1a= new ArrayList<TestData>();
		List<TestData> lst1b= new ArrayList<TestData>();
		List<TestData> lst2a= new ArrayList<TestData>();
		List<TestData> lst2b= new ArrayList<TestData>();
		
		
		Map<String, List<TestData>> testCaseDataMap = new LinkedHashMap<String, List<TestData>>();
		lst1a.add(new YamlTestDataForAPI1());
		lst1a.add(new YamlTestDataForAPI1());
		
		lst1b.add(new YamlTestDataForAPI1());
		lst1b.add(new YamlTestDataForAPI1());
		
		lst2a.add(new YamlTestDataForAPI2());
		lst2a.add(new YamlTestDataForAPI2());
		
		lst2b.add(new YamlTestDataForAPI2());
		lst2b.add(new YamlTestDataForAPI2());
		
		//TCName, List
		testCaseDataMap.put("testSinglePhotoCase1", lst1a);
		testCaseDataMap.put("testSinglePhotoCase2", lst1b);
		testCaseDataMap.put("testSetOfPhotosForAlbumId", lst2a);
		testCaseDataMap.put("testListOfElementsInParticularAlbumId", lst2b);
		
		
		obj.setAllTestCaseDataMap(testCaseDataMap);
		
		yaml.dump(obj, new FileWriter(new File("dummy_common_test_data.yml")));
		
		System.out.println("Demo yaml test case file ready...");
	}

}
