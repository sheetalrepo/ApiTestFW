package com.data.pojos;

/**
 * 	This class will be the place holder for all type of following APIs
 *  http://<domain>/photos/?albumId=<id>
 *  
 *  
 *  Note: VerifySingleAlbum1.java type of POJOs can be in hundreds;
 *   hence we need single POJO (like TestDataForAlbumApi.java) which represent all type of POJOs
 *   which corresponds to http://<domain>/?albumId=<id>
 */
public class TestDataForAlbumApi extends TestDataBaseClass{

	String albumID;

	public String getAlbumID() {
		return albumID;
	}

	public void setAlbumID(String albumID) {
		this.albumID = albumID;
	}

	@Override
	public String toString() {
		return "TestDataForAlbumApi [albumID=" + albumID + ", testCaseName=" + testCaseName + ", category=" + category
				+ "]";
	}

}
