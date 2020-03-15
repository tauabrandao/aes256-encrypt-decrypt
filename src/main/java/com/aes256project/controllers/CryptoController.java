package com.aes256project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.aes256project.model.Text;
import com.aes256project.service.CryptoService;

@Controller
public class CryptoController {

	@Autowired
	CryptoService cryptoService;

	@RequestMapping("/encrypt")
	public ModelAndView encryptText(Text text, RedirectAttributes redirectAttributes) {

		text.setEncryptedText(cryptoService.encrypt(text.getDecryptedText(), text.getKeyA(), text.getKeyB()));
		ModelAndView mv = new ModelAndView("redirect:/encrypt/form");
		redirectAttributes.addFlashAttribute("text", text);

		return mv;
	}
	
	@RequestMapping("/decrypt")
	public ModelAndView decryptText(Text text, RedirectAttributes redirectAttributes) {

		text.setDecryptedText(cryptoService.decrypt(text.getEncryptedText(), text.getKeyA(), text.getKeyB()));
		ModelAndView mv = new ModelAndView("redirect:/decrypt/form");
		redirectAttributes.addFlashAttribute("text", text);

		return mv;
	}


}
