package com.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

/**
 * @author Sheetal Singh
 */
public class PropertyFileReader {

	public static PropertyFilePojos getPropertyData() {
		ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
		PropertyFilePojos property = null;
		try {
			File file = new File(".\\src\\test\\resources\\properties.yaml");
			property = objectMapper.readValue(file, PropertyFilePojos.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return property;
	}

}
