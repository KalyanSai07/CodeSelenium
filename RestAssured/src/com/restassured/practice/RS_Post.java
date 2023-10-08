package com.restassured.practice;

import javax.xml.crypto.Data;

import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RS_Post {

	public static void main(String args[]) {

		JSONObject data = new JSONObject();

		data.put("empid", "101");
		data.put("empname", "kalyan");

		Response resp = RestAssured.given().contentType(ContentType.JSON).body(data.toJSONString())
				.post("https://reqres.in/api/users");

		int statuscode = resp.getStatusCode();
		System.out.println(statuscode);
		System.out.println(resp.getTime());
		System.out.println(resp.asString());

	}
}
