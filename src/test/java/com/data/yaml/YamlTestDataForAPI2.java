package com.data.yaml;

import com.data.TestData;

public class YamlTestDataForAPI2 extends TestData {

	String albumId;
	String category;
	
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
		return "YamlTestDataForAPI2 [albumId=" + albumId + ", category=" + category + "]";
	}
}
