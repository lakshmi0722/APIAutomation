package com.rest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.io.FileNotFoundException;

public class DataReader {
	public static FileReader reader;
	public static Properties pr;
	public void data() throws IOException {
		reader = new FileReader(".//InputData//TestData.properties");
		pr = new Properties();
		pr.load(reader);
		
	}

}
