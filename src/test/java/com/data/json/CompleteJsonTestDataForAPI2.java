package com.data.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This POJO is placeholder for VerifyAPI2's data.
 * i.e. List of data present inside testListOfElementsInParticularAlbumId.json, testSetOfPhotosForAlbumId.json etc
 * 
 * @author Sheetal Singh
 */
public class CompleteJsonTestDataForAPI2 {

	@SerializedName("Data")
	@Expose
	private List<JsonTestDataForAPI2> list = null;

	public List<JsonTestDataForAPI2> getData() {
		return list;
	}

	public void setData(List<JsonTestDataForAPI2> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "JSONTestDataAPI2 [list=" + list + "]";
	}

}