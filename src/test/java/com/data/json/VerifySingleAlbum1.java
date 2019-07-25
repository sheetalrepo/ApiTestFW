package com.data.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class represent third test data row in input JSON TestData.json
 * 
 * Note: These POJOs are respective to single data row in TestData.json. Hence
 * for every data row, there will be a new POJOs. Hence these POJOs can be in
 * hundreds
 */
public class VerifySingleAlbum1 {

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
		return "VerifySingleAlbum1 [albumId=" + albumId + ", category=" + category + "]";
	}

}
