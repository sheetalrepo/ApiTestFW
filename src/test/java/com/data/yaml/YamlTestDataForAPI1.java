package com.data.yaml;

import com.data.TestData;

public class YamlTestDataForAPI1 extends TestData {

	String photoId;
	String category;

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
		return "YmlTestDataForAPI1 [photoId=" + photoId + ", category=" + category + "]";
	}
}
