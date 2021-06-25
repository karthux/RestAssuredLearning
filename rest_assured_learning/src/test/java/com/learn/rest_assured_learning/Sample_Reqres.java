package com.learn.rest_assured_learning;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Sample_Reqres {
	
	@Test
	public void getRequestExample() {
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		ResponseBody responsebody = response.body(); 
		
		//response.getbody() -- does the same operation as of .body();
		System.out.println(responsebody.asString()); //asString will print response body as a string
		
		//to print like json formatter
		System.out.println(responsebody.asPrettyString());
	}

}
