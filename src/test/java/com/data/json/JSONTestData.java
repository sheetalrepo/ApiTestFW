package com.data.json;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class is common placeholder for all the test cases written in input json
 * TestData.json
 * 
 * For all the test cases in JSON we will have a respective pojo class which
 * will represent test data
 *
 * Generated using http://www.jsonschema2pojo.org/
 */
public class JSONTestData {

	@SerializedName("VerifySinglePhoto1")
	@Expose
	private List<VerifySinglePhoto1> verifySinglePhoto1 = null;
	@SerializedName("VerifySinglePhoto2")
	@Expose
	private List<VerifySinglePhoto2> verifySinglePhoto2 = null;
	@SerializedName("VerifySingleAlbum1")
	@Expose
	private List<VerifySingleAlbum1> verifySingleAlbum1 = null;

	public List<VerifySinglePhoto1> getVerifySinglePhoto1() {
		return verifySinglePhoto1;
	}

	public void setVerifySinglePhoto1(List<VerifySinglePhoto1> verifySinglePhoto1) {
		this.verifySinglePhoto1 = verifySinglePhoto1;
	}

	public List<VerifySinglePhoto2> getVerifySinglePhoto2() {
		return verifySinglePhoto2;
	}

	public void setVerifySinglePhoto2(List<VerifySinglePhoto2> verifySinglePhoto2) {
		this.verifySinglePhoto2 = verifySinglePhoto2;
	}

	public List<VerifySingleAlbum1> getVerifySingleAlbum1() {
		return verifySingleAlbum1;
	}

	public void setVerifySingleAlbum1(List<VerifySingleAlbum1> verifySingleAlbum1) {
		this.verifySingleAlbum1 = verifySingleAlbum1;
	}

	@Override
	public String toString() {
		return "JSONTestData [verifySinglePhoto1=" + verifySinglePhoto1 + ", verifySinglePhoto2=" + verifySinglePhoto2
				+ ", verifySingleAlbum1=" + verifySingleAlbum1 + "]";
	}

}
