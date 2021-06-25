package com.learn.rest_assured_learning;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class Sample_Reqres {

	@Test
	public void getRequestExample() {
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		ResponseBody responsebody = response.body(); 

		//response.getbody() -- does the same operation as of .body();
		System.out.println(responsebody.asString()); //asString will print response body as a string

		//to print like json formatter
		System.out.println(responsebody.asPrettyString());
		System.out.println("--------------------------------------------------------------");
	}
	@Test
	public void CucumberGETRequest() {

		RestAssured.baseURI="https://reqres.in/api/";
		
		ValidatableResponse response = RestAssured
		.given()
			.param("", "")
			.header("","")
		.when()
			.get("/users/2")
			.then() //Returns a validatable response that's lets you validate the response. 
			.statusCode(200);
		
	}
}
