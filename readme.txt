# API Framework: YAML (Different Data Provider for Diff APIs)
1. Framework support GET request as of now. However can be enhanced for other request.
2. All the test data for different type of APIs are kept according to Test Class Name and Method Name under (src\test\resources\testdata)
3. For every API we have separate Data Provider
4. For every @Test method we have different yaml
5. Test Data is kept in a YAML file rather json, excel, csv etc


## Advantages ##
1. Its a properly layered framework means every layer has its own functionalities 

	#Data Layer (src/test/java/com/data)
		a. Data layer will read respective yaml, convert it into respective POJOs (src/test/java/com/data/yaml/YamlTestDataForAPIX.java).
		b. Further YamlTestDataForAPIX POJOs get converted as List<YamlTestDataForAPIX> into YamlTestDataBaseClassForAPIX POJOs 


	#Business Layer (src/test/java/com/businesslayer)
		a. Sole purpose is to perform business logic tasks
		b. Methods expects some data and populate response POJOs (src/test/java/com/pojos)
		
	#Test Case Layer (src/test/java/testcases)
		a. Will get data from Data Provider, Call Business Layer for operation and perform Assertions
	

2. Data is getting picked from YAML rather excel. Make sure data is kept either in JSON, YAML or CSV but never in excel
3. Logger has been implemented and logs can be taken from /target/output.log


## Disadvantages ##
We have one DataProvider for one API. In case API grows then Data Provider methods will also grow.


#TODOs
a. POST request implementation
b. single data provider for all the data


#Test APIs
http://jsonplaceholder.typicode.com/photos                  |  contains 100 albums
http://jsonplaceholder.typicode.com/photos/?albumId=1       |  1 album have 50 ids
http://jsonplaceholder.typicode.com/photos/1		        |  1 id have 1 title, 1 url etc



