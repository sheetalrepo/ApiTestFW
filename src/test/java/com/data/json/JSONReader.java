package com.data.json;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import com.google.gson.Gson;

/**
 * 
 *
 */
public class JSONReader {
	
	public static JSONTestData fetchJSONIntoPojos() {
		Gson gson = new Gson();
		JSONTestData jsonTestData = null;

		//TODOs: read path from property file
		try (Reader reader = new FileReader(".\\src\\test\\resources\\TestData.json")) {
			jsonTestData = gson.fromJson(reader, JSONTestData.class);
		}catch (IOException e) {
            e.printStackTrace();
        }
		
		return jsonTestData;	
	}
	

	
	
	public static void main(String [] args) {
		JSONTestData JSONTestData = fetchJSONIntoPojos();
		System.out.println(JSONTestData.toString());
	}
}
