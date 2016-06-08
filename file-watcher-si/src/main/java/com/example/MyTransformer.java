package com.example;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyTransformer {

	public String transform(File file) throws JsonProcessingException, IOException {
		ObjectMapper om = new ObjectMapper();

		return om.writeValueAsString(om.readTree(file));
	}

}
