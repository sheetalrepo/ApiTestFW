package com.data.pojos;

/**
 * This will be Base Class for all type of test data
 * 
 * will contains params which are common to all types of APIs
 * currently we have only two type of api
 * 
 * In out test data we are mentioning only three things TestCaseName, Category Of TestCase and 
 * ID (albumID or photo id)
 */
public class TestDataBaseClass {

	String testCaseName;
	String category;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTestCaseName() {
		return testCaseName;
	}
	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}
	
	@Override
	public String toString() {
		return "TestDataBaseClass [category=" + category + ", testCaseName=" + testCaseName + "]";
	}
	
}
