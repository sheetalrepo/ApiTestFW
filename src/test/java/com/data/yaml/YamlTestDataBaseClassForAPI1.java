package com.data.yaml;

import java.util.List;

public class YamlTestDataBaseClassForAPI1 {

	List<YamlTestDataForAPI1> yamlTestDataForAPI1;

	public List<YamlTestDataForAPI1> getYamlTestDataForAPI1() {
		return yamlTestDataForAPI1;
	}

	public void setYamlTestDataForAPI1(List<YamlTestDataForAPI1> yamlTestDataForAPI1) {
		this.yamlTestDataForAPI1 = yamlTestDataForAPI1;
	}

	@Override
	public String toString() {
		return "YamlTestDataBaseClassForAPI1 [yamlTestDataForAPI1=" + yamlTestDataForAPI1 + "]";
	}
}
