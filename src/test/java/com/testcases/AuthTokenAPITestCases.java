package com.testcases;

import org.testng.annotations.Test;
import com.businesslayer.AuthTokenBusinessLogic;
import com.data.DataProviderClass;
import com.data.yaml.YamlTestDataForAuthTokenApi;
import com.pojos.AuthTokenResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Sheetal Singh
 */
public class AuthTokenAPITestCases {

	private static final Logger LOGGER = LogManager.getLogger(AuthTokenAPITestCases.class);

	@Test
	public void testAuthTokenGenerationOld() {
		//Given
		AuthTokenResponse response = AuthTokenBusinessLogic.getAuthTokenResponse("D123", "U_John", "X_Man");
		String authToken = response.getAuthenticationToken();
		LOGGER.info("### Generated Auth Token:" + authToken);
		
		//Then
		//verifyGeneratedToken();
	}

	@Test(dataProvider = "common_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void testAuthTokenGeneration(YamlTestDataForAuthTokenApi apitestdata) {
		//Given
		AuthTokenResponse response = AuthTokenBusinessLogic.getAuthTokenResponse
				(apitestdata.getDeivceId(), apitestdata.getUserName(), apitestdata.getxCusName());
		String authToken = response.getAuthenticationToken();
		LOGGER.info("### Generated Auth Token:" + authToken);
		
		//Then
		//verifyGeneratedToken();
	}

}
