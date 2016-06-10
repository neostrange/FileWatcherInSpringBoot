package com.example;

import java.io.File;

import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;


public class EmptyFileIdentifier {
	
	@Transformer
	public Message<?> addDelayHeader(GenericMessage<?> msg){

		Message<?> newMsg;
		
		File file= (File) msg.getPayload();
		
		if (file.length()<1){
			newMsg = MessageBuilder.fromMessage(msg).setHeaderIfAbsent("delay", "delay").build();
			System.out.println("In EmptyFileIdentifier -- This file is empty:"+file.getName());
			return newMsg;
		}
		
		return msg;
	}
	

}
