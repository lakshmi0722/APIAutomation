package com.rest;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ListUsersTest extends DataReader {
	
	
	public static FileReader reader;
	public static Properties pr;
	@Test
	public void listUsersTest() throws IOException {
		reader = new FileReader(".//InputData//TestData.properties");
		pr = new Properties();
		pr.load(reader);
		
		RestAssured.baseURI=pr.getProperty("baseUri");
		RestAssured.basePath=pr.getProperty("ListUsers");
				
	Response res = given()
			.param("page",2)
			.auth().none()
	.when()
	.get()
	.then()
	.statusCode(200)
	.statusLine("HTTP/1.1 200 OK")
	.log().all()
	.extract().response();
	/*String sJ = res.asString();
	Assert.assertTrue(sJ.contains("janet.weaver@reqres.in"));
	Assert.assertTrue(sJ.contains("Janet"));
	Assert.assertTrue(sJ.contains("Weaver"));*/
		
	}

}
