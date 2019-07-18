package com.data.pojos;

import java.util.List;

/**
 * http://jsonplaceholder.typicode.com/photos
 * 
 * shows complete list of albums and photos
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
