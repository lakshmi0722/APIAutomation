package com.rest;

import static io.restassured.RestAssured.given;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RegisterUnsuccessTest {
	
	public static FileReader reader;
	public static Properties pr;
	
	@Test
	public void registerUnsuccessTest() throws IOException {
		reader = new FileReader(".//InputData//TestData.properties");
		pr = new Properties();
		pr.load(reader);
		
		RestAssured.baseURI=pr.getProperty("baseUri");
		RestAssured.basePath=pr.getProperty("RegisterUnsuccess");
		
		HashMap hm = new HashMap();
		hm.put("email", "sydney@fife");
		
		given()
		.contentType("application/json")
		.body(hm)
		.when()
		.post()
		.then()
		.log().all()
		.statusCode(400)
		.statusLine("HTTP/1.1 400 Bad Request");
		
		
	}

}
