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
		ModelAndView mv = new ModelAndView("redirect:/encrypt/form");

		try {
			text.setEncryptedText(cryptoService.encrypt(text.getDecryptedText(), text.getKeyA(), text.getKeyB()));
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("msg", "Error: This text could not be encrypted");
		}
		redirectAttributes.addFlashAttribute("text", text);

		return mv;
	}

	@RequestMapping("/decrypt")
	public ModelAndView decryptText(Text text, RedirectAttributes redirectAttributes) {
		ModelAndView mv = new ModelAndView("redirect:/decrypt/form");

		try {
			text.setDecryptedText(cryptoService.decrypt(text.getEncryptedText(), text.getKeyA(), text.getKeyB()));
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("msg", "Error: This text could not be decrypted");
		}
		redirectAttributes.addFlashAttribute("text", text);

		return mv;
	}

}
