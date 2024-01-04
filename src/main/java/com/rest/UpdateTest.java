package com.rest;

import java.util.HashMap;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class UpdateTest {
	
	@Test()
	public void userTest() {
		
		HashMap hm = new HashMap();
		Faker fk = new Faker();
		String firstName=fk.name().firstName();
		String jobTitle=fk.job().title();
		hm.put("name",firstName);
		hm.put("job", jobTitle);
		
		Response res = given()
		.contentType("application/json")
		.body(hm)
		.when()
		.put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().all()
		.extract().response();
		
		String jsonStr = res.asString();
		Assert.assertEquals(jsonStr.contains(firstName), true);
		Assert.assertEquals(jsonStr.contains(jobTitle), true);
		

		
	}
	
	

}
