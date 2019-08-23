package com.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

/**
 * This class will read the properties.yaml file
 * 
 * @author Sheetal Singh
 */
public class PropertyFileReader {

	public static PropertyFilePojo getPropertyData() {
		ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
		PropertyFilePojo property = null;
		try {
			File file = new File(".\\src\\test\\resources\\properties.yaml");
			property = objectMapper.readValue(file, PropertyFilePojo.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return property;
	}

}
