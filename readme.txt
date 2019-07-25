# API Framework: <brach: master_fw_multdp_singlejson>
1. Framework support GET request as of now. However can be enhanced for other request.
2. All the test data for different type of APIs are kept under single json TestData.json (src/test/resources)
3. For every data row in TestData.json, we have a separate Data Provider (src/test/java/com/data)
4. Test Data is kept in a JSON file rather excel, csv etc


## Advantages ##
1. Its a properly layered framework means every layer has its own functionalities 

	#Data Layer (src/test/java/data)
		a. Data layer will read json, convert it into different POJOs (src/test/java/data/json/VerifyXXX.java).
		b. Further multiple POJOs get converted into fewer APIs POJOs (src/test/java/data/pojos/TestDataForXXX.java) 


	#Business Layer (src/test/java/com/businesslayer)
		a. Sole purpose is to perform business logic tasks
		b. Methods expects some data and populate response POJOs (src/test/java/com/pojos)
		
	#Test Case Layer (src/test/java/testcases)
		a. Will get data from Data Provider, Call Business Layer for operation and perform Assertions
	

2. Data is getting picked from JSON rather excel. Make sure data is kept either in JSON, YAML or CSV but never in excel
3. Logger has been implemented and logs can be taken from /target/output.log


## Disadvantages ##
1. We have multiple single DataProvider for every data row. In case data grows then Data Provider methods will also grow.
2. All test data for all APIs are kept under single json. If we have lot of data, multiple columns, and huge data from POST req
  then JSON view will become complicated



#TODOs
a. POST request implementation
b. single data provider for all the data
c. YAML can be implemented rather JSON for big data


#Test APIs
http://jsonplaceholder.typicode.com/photos                  |  contains 100 albums
http://jsonplaceholder.typicode.com/photos/?albumId=1       |  1 album have 50 ids
http://jsonplaceholder.typicode.com/photos/1		        |  1 id have 1 title, 1 url etc



