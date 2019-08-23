package com.data;

import java.util.Map;

/**
 * This class will hold the key-value pair from properties.yaml file
 * 
 * @author Sheetal Singh
 */
public class PropertyFilePojo {

	private Map<String, String> apis;

	public Map<String, String> getApis() {
		return apis;
	}

	public void setApis(Map<String, String> apis) {
		this.apis = apis;
	}

	@Override
	public String toString() {
		return "PropertyFilePojos [apis=" + apis + "]";
	}
	
}
