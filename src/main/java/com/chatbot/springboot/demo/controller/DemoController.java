package com.chatbot.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
//create a4mapping 
	
	@GetMapping("/hello")
	public String sayHello(Model theModel) {
			theModel.addAttribute("theDate", new java.util.Date());
			return "helloworld";
	}
	@GetMapping("/chat")
	public String sayHellochat(Model theModel) {
			theModel.addAttribute("theMessage", "Hi There, I am using this Chatbot");
			return "chat";
	}
}
