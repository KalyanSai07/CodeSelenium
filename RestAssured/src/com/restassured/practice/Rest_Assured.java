package com.restassured.practice;

import io.restassured.response.Response;
import io.restassured.RestAssured;

public class Rest_Assured {

public static void main (String args[]) {
		
Response resp = RestAssured.get("https://reqres.in/api/users/2");
int statuscode = resp.getStatusCode();
System.out.println(statuscode);
System.out.println(resp.getTime());		
System.out.println(resp.asString());		
}

	
}
