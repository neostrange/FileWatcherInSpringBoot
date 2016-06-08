package com.example;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class FileProcessor {
	
	
	public File processFile(File file) throws JsonGenerationException, JsonMappingException, IOException{
		System.out.println("file name is : " + file.getName());
		
	 
		ObjectMapper om = new ObjectMapper();
		JsonNode jn= om.readTree(file);
		
		
		om.writeValue(file, jn);
		
		return file;
	}

}
