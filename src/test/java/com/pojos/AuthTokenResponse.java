package com.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthTokenResponse {

	@JsonProperty("authenticationToken")
	String authenticationToken;

	public String getAuthenticationToken() {
		return authenticationToken;
	}

	public void setAuthenticationToken(String authenticationToken) {
		this.authenticationToken = authenticationToken;
	}

	@Override
	public String toString() {
		return "AuthTokenResponse [authenticationToken=" + authenticationToken + "]";
	}		
}
