# API Framework:
1. Framework support GET request as of now. However can be enhanced for other request.
2. All the test data for different type of APIs are kept according to Test Class Name and Method Name under (src\test\resources\testdata)
3. For every API we have separate Data Provider
4. For one API, single data provider will be there. 
5. For every @Test method we have different json for to pass test data. This is done so that data is human readable. Else huge json data become non human readable.
6. Test Data is kept in a JSON file rather excel, csv etc


## Advantages ##
1. Its a properly layered framework means every layer has its own functionalities 

	#Data Layer (src/test/java/com/data)
		a. Data layer will read respective json, convert it into respective POJOs (src/test/java/com/data/json/JsonTestDataForAPIX.java).
		b. Further JsonTestDataForAPIX POJOs get converted as List<JsonTestDataForAPIX> into CompleteJsonTestDataForAPIX POJOs (src/test/java/com/data/json/CompleteJsonTestDataForAPIX.java) 


	#Business Layer (src/test/java/com/businesslayer)
		a. Sole purpose is to perform business logic tasks
		b. Methods expects some data and populate response POJOs (src/test/java/com/pojos)
		
	#Test Case Layer (src/test/java/testcases)
		a. Will get data from Data Provider, Call Business Layer for operation and perform Assertions
	

2. Data is getting picked from JSON rather excel. Make sure data is kept either in JSON, YAML or CSV but never in excel
3. Logger has been implemented and logs can be taken from /target/output.log


## Disadvantages ##
We have one DataProvider for one API. In case API grows then Data Provider methods will also grow. But generally we don't have too many APIs to test.



#TODOs
a. POST request implementation
b. single data provider for all the data
c. YAML can be implemented rather JSON for big data


#Test APIs
http://jsonplaceholder.typicode.com/photos                  |  contains 100 albums
http://jsonplaceholder.typicode.com/photos/?albumId=1       |  1 album have 50 ids
http://jsonplaceholder.typicode.com/photos/1		        |  1 id have 1 title, 1 url etc



