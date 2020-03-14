package com.aes256project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aes256project.model.Text;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "home";
	}
	
	
	@RequestMapping("/encrypt")
	public String encryptForm(Text text) {
		
		System.out.println(text);
		
		return "encryptForm";
	}
}
