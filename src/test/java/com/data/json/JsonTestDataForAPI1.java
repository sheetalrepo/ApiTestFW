package com.data.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * This POJO is representation of our test data for API1 i.e. Single Photo API
 * 
 * @author Sheetal Singh
 */
public class JsonTestDataForAPI1 {

	@SerializedName("photoId")
	@Expose
	private String photoId;

	@SerializedName("category")
	@Expose
	private String category;

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "VerifyAPI1 [photoId=" + photoId + ", category=" + category + "]";
	}

}