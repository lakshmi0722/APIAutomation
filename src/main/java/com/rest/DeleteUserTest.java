package com.rest;

import static io.restassured.RestAssured.given;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteUserTest {
	
	public static FileReader reader;
	public static Properties pr;
	
	@Test
	public void deleteUserTest() throws IOException {
		
		reader = new FileReader(".//InputData//TestData.properties");
		pr = new Properties();
		pr.load(reader);
		
		RestAssured.baseURI=pr.getProperty("baseUri");
		RestAssured.basePath=pr.getProperty("DeleteUser");
				
		given()
		.when()
		.delete()
		.then()
		.log().all()
		.statusCode(204);
	
	}
}
