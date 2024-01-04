package com.rest;

import static io.restassured.RestAssured.given;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DelayedResponseTest {
	
	public static FileReader reader;
	public static Properties pr;
	@Test
	public void deyalyedResponseTest() throws IOException {
		reader = new FileReader(".//InputData//TestData.properties");
		pr = new Properties();
		pr.load(reader);
		
		RestAssured.baseURI=pr.getProperty("baseUri");
		RestAssured.basePath=pr.getProperty("DelayedResponse");
				
	given()
			.param("delay",3)
			.auth().none()
	.when()
	.get()
	.then()
	.statusCode(200)
	.statusLine("HTTP/1.1 200 OK")
	.log().all()
	.extract().response();

}
}
