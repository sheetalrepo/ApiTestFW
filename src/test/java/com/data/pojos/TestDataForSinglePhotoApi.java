package com.data.pojos;

/**
 * 	This class will be the place holder for all type of following APIs
 *  http://<domain>/photos/<id>
 *  
 *  
 *  Note: VerifySinglePhoto1.java type of POJOs can be in hundreds;
 *   hence we need single POJO (like TestDataForSinglePhotoApi.java) which represent all type of POJOs
 *   which corresponds to http://<domain>/photos/<id>
 */
public class TestDataForSinglePhotoApi extends TestDataBaseClass{

	String photoId;

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	@Override
	public String toString() {
		return "TestDataForSinglePhotoApi [photoId=" + photoId + ", testCaseName=" + testCaseName + ", category="
				+ category + "]";
	}
}
