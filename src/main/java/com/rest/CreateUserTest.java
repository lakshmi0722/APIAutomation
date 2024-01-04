package com.rest;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;


public class CreateUserTest extends DataReader {
	
	public static FileReader reader;
	public static Properties pr;
	
	@Test
	public void createUserTest() throws IOException {
		
		reader = new FileReader(".//InputData//TestData.properties");
		pr = new Properties();
		pr.load(reader);
		
		RestAssured.baseURI=pr.getProperty("baseUri");
		RestAssured.basePath=pr.getProperty("CreateUser");
		
		HashMap hm = new HashMap();
		Faker fk = new Faker();
		
		hm.put("name",fk.name().firstName());
		hm.put("job", fk.job().title());
		
		given()
		.contentType("application/json")
		.body(hm)
		.when()
		.post()
		.then()
		.log().all()
		.statusCode(201)
		.statusLine("HTTP/1.1 201 Created");
		
	}
	

}
