package com.emailsender.controller;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;

import com.emailsender.service.EmailSenderService;

import jakarta.mail.MessagingException;

@Controller
public class EmailSenderController {
	
	@Autowired
	private EmailSenderService senderService;
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
//		senderService.sendSimpleEmail("vaishnavikasture93@gmail.com", 
//				"This is the Email Body...", 
//				"This is the Email Subject...");
		
		senderService.sendEmailWithAttachement("vaishnavikasture93@gmail.com",
				"This is the Email Body...", 
				"This is the Email Subject...", 
				//"C:\\Users\\mahes\\Downloads\\Core Java Certificate.pdf");
		"C:\\Users\\mahes\\OneDrive\\Pictures\\logo.jpg");
	}
	
	
	

}


