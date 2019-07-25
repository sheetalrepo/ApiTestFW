package com.data.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class represent first test data row in input JSON TestData.json
 * 
 * Note: These POJOs are respective to single data row in TestData.json. Hence
 * for every data row, there will be a new POJOs. Hence these POJOs can be in
 * hundreds
 * 
 */
public class VerifySinglePhoto1 {

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
		return "VerifySinglePhoto1 [photoId=" + photoId + ", category=" + category + "]";
	}

}
