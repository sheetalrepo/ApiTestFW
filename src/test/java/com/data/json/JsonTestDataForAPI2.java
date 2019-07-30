package com.data.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This POJO is representation of our test data for API2 i.e. Album API
 * 
 * @author Sheetal Singh
 */
public class JsonTestDataForAPI2 {

	@SerializedName("albumId")
	@Expose
	private String albumId;

	@SerializedName("category")
	@Expose
	private String category;

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "VerifyAPI2 [albumId=" + albumId + ", category=" + category + "]";
	}

}