package com.data.yaml;

/**
 * This class is placeholder for all type of test data
 * e.g. some API need only single param, some POST Api may require 10 columns data
 * 
 * This is an abstract class and contains basic fields like testCategory, its value will be like smoke, sanity , regression etc
 * 
 * @author Sheetal Singh
 */
public abstract class TestData {
	
	private String testCategory;

	public String getTestCategory() {
		return testCategory;
	}

	public void setTestCategory(String testCategory) {
		this.testCategory = testCategory;
	}
	
}
