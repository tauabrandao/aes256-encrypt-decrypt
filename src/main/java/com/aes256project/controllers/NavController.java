package com.aes256project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavController {

	@RequestMapping("/encrypt/form")
	public String encryptForm() {
		return "encryptForm";
	}
	
	@RequestMapping("/decrypt/form")
	public String decryptForm() {
		return "decryptForm";
	}
	
	@RequestMapping("api")
	public String apiPage() {
		return "apiPage";
	}
}
