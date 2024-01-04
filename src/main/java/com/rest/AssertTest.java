package com.rest;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class AssertTest {
	
	@Test()
	
	public void assertTest() {
		
		HashMap hm = new HashMap();
		hm.put("name", "Nameone");
		hm.put("job", "JobOne");
		
		Response res = given()
		.contentType("application/json")
		.body(hm)
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all()
		.extract().response();
				
		String jsonstr = res.asString();
		Assert.assertEquals(jsonstr.contains("Nameone"), true);
	Assert.assertEquals(jsonstr.contains("JobOne"), true);
		
	}

}
