package com.data.yaml;

public class YamlTestDataForAPI1 extends TestData {

	String photoId;
	String myId; //for testing purpose only

	public String getMyId() {
		return myId;
	}

	public void setMyId(String myId) {
		this.myId = myId;
	}

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	@Override
	public String toString() {
		return "YamlTestDataForAPI1 [photoId=" + photoId + "]";
	}

}
