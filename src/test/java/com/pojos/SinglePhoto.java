package com.pojos;

/**
 * POJOs for API Response   http://<domain>/photos/<id>
 * e.g. http://jsonplaceholder.typicode.com/photos/10
 * 
 * POJOs required to have actual representations of our particular API's response
 * 
 * @author Sheetal Singh
 */
public class SinglePhoto {

	String albumId;
	String id;
	String title;
	String url;
	String thumbnailUrl;
	
	public String getAlbumId() {
		return albumId;
	}
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	
	@Override
	public String toString() {
		return "SinglePhoto [albumId=" + albumId + ", id=" + id + ", title=" + title + ", url=" + url + ", thumbnailUrl="
				+ thumbnailUrl + "]";
	}
}
