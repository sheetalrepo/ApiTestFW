package com.data.yaml;

public class YamlTestDataForAuthTokenApi extends TestData {

	String deivceId;
	String userName;
	String xCusName;
	
	public String getDeivceId() {
		return deivceId;
	}
	public void setDeivceId(String deivceId) {
		this.deivceId = deivceId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getxCusName() {
		return xCusName;
	}
	public void setxCusName(String xCusName) {
		this.xCusName = xCusName;
	}
	
	@Override
	public String toString() {
		return "YamlTestDataForAuthTokenApi [deivceId=" + deivceId + ", userName=" + userName + ", xCusName=" + xCusName
				+ "]";
	}

}
