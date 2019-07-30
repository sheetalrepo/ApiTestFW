package com.data.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This POJO is placeholder for VerifyAPI1's data.
 * i.e. List of data present inside testSinglePhotoCase1.json, testSinglePhotoCase2.json etc
 * 
 * @author Sheetal Singh
 */
public class CompleteJsonTestDataForAPI1 {

	@SerializedName("Data")
	@Expose
	private List<JsonTestDataForAPI1> list = null;

	public List<JsonTestDataForAPI1> getData() {
		return list;
	}

	public void setData(List<JsonTestDataForAPI1> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "JSONTestDataAPI1 [list=" + list + "]";
	}

}