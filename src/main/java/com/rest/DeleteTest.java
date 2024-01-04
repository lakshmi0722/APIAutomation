package com.rest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class DeleteTest {
	
	@Test()
	public void deleteTest() {
		
		given()
		.when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log().all()
		.statusLine("HTTP/1.1 204 No Content");
	
	}

}
