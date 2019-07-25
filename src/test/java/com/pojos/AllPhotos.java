package com.pojos;

import java.util.List;

/**
 * POJOs for API Response   http://<domain>/photos
 * http://jsonplaceholder.typicode.com/photos
 * 
 * POJOs required to have actual representations of our particular API's response
 * 
 * @author Sheetal Singh
 */
public class AllPhotos {

	List<SinglePhoto> listOfPhotos;

	public List<SinglePhoto> getListOfPhotos() {
		return listOfPhotos;
	}

	public void setListOfPhotos(List<SinglePhoto> listOfPhotos) {
		this.listOfPhotos = listOfPhotos;
	}

	@Override
	public String toString() {
		return "AllPhotos [listOfPhotos=" + listOfPhotos + "]";
	}

}
