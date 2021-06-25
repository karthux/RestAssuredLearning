package com.learn.rest_assured_learning;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SamplePUTRequest {

	@Test
	public void putrequestexample() {

		JSONObject jsonobject = new JSONObject();
		jsonobject.put("name", "Uday");
		jsonobject.put("job", "SDET");

		RestAssured.baseURI="https://reqres.in/api/";
		RestAssured.given()
		.when()
		.body(jsonobject.toJSONString())
		.put("/users/2") //same way we can use patch request
		.then()
		.statusCode(200);
	}
	@Test
	public void deleteRequestexample() {
		RestAssured.baseURI="https://reqres.in/api/";
		
		RestAssured.given()
		.when()
		.delete("/users/2")
		.then()
		.statusCode(204);
	}

}
