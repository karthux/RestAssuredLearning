package com.learn.rest_assured_learning;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleGETrequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//http://www.google.co.in

		Response response = RestAssured.get("http://www.google.co.in");
		response.statusCode();
		String statusline = response.statusLine();
		System.out.println(response.statusCode());
		System.out.println(statusline);
	}

}
