package com.org;

import org.testng.annotations.Test;

public class Attribute1Invcount {
	
	@Test(invocationCount=3)
	public void attribute1() {
		
		System.out.println("Run 3 times");
		
	}
	
	

}
