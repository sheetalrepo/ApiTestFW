package com.data.helper;

import org.testng.annotations.DataProvider;
import com.data.pojos.SinglePhoto;


public class TestDataProvider {
	
	@DataProvider(name="JsonDataProvider")
	public static Object[][] getDataForPhotosApis(){
		
		Object data[][] = new Object[4][1];
		
		data[0][0]=new SinglePhoto();	
		data[1][0]=new SinglePhoto();
		data[2][0]=new SinglePhoto();
		data[3][0]=new SinglePhoto();
		
		return data;
	}
	
	
	
	@DataProvider(name="CSVDataProvider")
	public static Object[][] getCSVData(){
		
		Object data[][] = new Object[4][1];
		
		data[0][0]=new SinglePhoto();	
		data[1][0]=new SinglePhoto();
		data[2][0]=new SinglePhoto();
		data[3][0]=new SinglePhoto();
		
		return data;
	}
	

}
