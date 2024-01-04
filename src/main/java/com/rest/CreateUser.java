package com.rest;

import java.util.HashMap;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class CreateUser {
	
	@Test()
	public void newUser() {
		HashMap hm = new HashMap();
		
		Faker fk = new Faker();
		
		hm.put("name",fk.name().firstName());
		hm.put("job", fk.job().title());
		System.out.println(hm);
		
		given()
		.contentType("application/json")
		.body(hm)
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.log().all()
		.statusCode(201)
		.statusLine("HTTP/1.1 201 Created");
	}
	
}
