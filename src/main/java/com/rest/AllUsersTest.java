package com.rest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class AllUsersTest {
	
	@Test
	public void users() 
	{
		
	given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.log().all()
		.statusCode(200).statusLine("HTTP/1.1 200 OK")
		.body("data[0].email",equalTo("michael.lawson@reqres.in"))
		.body("data[0].first_name",equalTo("Michael"))
		.body("data[0].last_name",equalTo("Lawson"))
		.body("data.email", hasItems("michael.lawson@reqres.in", "lindsay.ferguson@reqres.in"));
	}
	
	@Test
	public void singleUser() {
		
		given()
		.when()
		.get("https://reqres.in/api/unknown")
		.then()
		.log().all()
		.statusCode(200).statusLine("HTTP/1.1 200 OK")
		.body("data[0].name",equalTo("cerulean"))
		.body("data.name", hasItems("cerulean", "fuchsia rose"));
		
			
	}
	
	
}
