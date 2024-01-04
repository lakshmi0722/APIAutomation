package com.org;

import org.testng.annotations.Test;

public class Atrribute2InvTimeOut {

	@Test(invocationCount=2,invocationTimeOut=30000)
	
	public void attribute2() {
		
		System.out.println("Attribute time out");
		
	}
	
}
