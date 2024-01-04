package com.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnimalsTest {
	
	@BeforeClass
	public void lion() {
		
		System.out.println("Lion");
	}
	
	@BeforeSuite
	public void tiger() {
		
		System.out.println("Tiger");
		
	}
	@Test
	public void zebra() {
			
			System.out.println("Zebra");
			
		}
	
	@AfterMethod
	public void monkey() {
		
		System.out.println("Monkey");
		
	}
	
	@AfterClass
	public void dog() {
			
			System.out.println("Dog");
			
		}

}
