package com.data.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class represent second test data row in input JSON TestData.json
 */
public class VerifySinglePhoto2 {

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
		return "VerifySinglePhoto2 [photoId=" + photoId + ", category=" + category + "]";
	}

}