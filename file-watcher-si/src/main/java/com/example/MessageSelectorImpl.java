package com.example;

import java.io.File;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageSelectorImpl implements MessageSelector  {

	@Override
	public boolean accept(Message<?> message) {
		// TODO Auto-generated method stub
		File file = (File) message.getPayload();
		System.out.println("This file is:"+file.getName());
		
		if(file.length() < 1) 
		return false;
		
		return true;
	}

}
