package com.data.json;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.log4j.Logger;
import com.google.gson.Gson;

/**
 * Reading actual json file and convert it into JSONTestData Java Class using
 * GSON lib
 *
 */
public class JSONReader {
	private static final Logger LOGGER = Logger.getLogger(JSONReader.class);

	public static JSONTestData fetchJSONIntoPojos() {
		Gson gson = new Gson();
		JSONTestData jsonTestData = null;

		// TODOs: read path from property file
		try (Reader reader = new FileReader(".\\src\\test\\resources\\TestData.json")) {
			jsonTestData = gson.fromJson(reader, JSONTestData.class);
		} catch (IOException e) {
			LOGGER.error(e);
			e.printStackTrace();
		}

		return jsonTestData;
	}
}
