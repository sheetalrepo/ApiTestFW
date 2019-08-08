package com.data.yaml;

import java.util.List;

public class YamlTestDataBaseClassForAPI2 {

	List<YamlTestDataForAPI2> yamlTestDataForAPI2;

	public List<YamlTestDataForAPI2> getYamlTestDataForAPI2() {
		return yamlTestDataForAPI2;
	}

	public void setYamlTestDataForAPI2(List<YamlTestDataForAPI2> yamlTestDataForAPI2) {
		this.yamlTestDataForAPI2 = yamlTestDataForAPI2;
	}

	@Override
	public String toString() {
		return "YamlTestDataBaseClassForAPI2 [yamlTestDataForAPI2=" + yamlTestDataForAPI2 + "]";
	}
}
