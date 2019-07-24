package com.data;

import java.util.Map;

public class PropertyFilePojos {

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
