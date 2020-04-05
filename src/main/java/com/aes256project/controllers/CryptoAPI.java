package com.aes256project.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aes256project.dto.CryptoDTO;
import com.aes256project.service.CryptoService;
import com.google.gson.Gson;

@RestController
public class CryptoAPI {

	@Autowired
	CryptoService cryptoService;

	@RequestMapping(value = "/api/crypto", method = RequestMethod.POST)
	@ResponseBody
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseEntity<String> encrypt(@RequestBody String json) {
		Integer operation = null;
		String result = null;
		CryptoDTO dto = null;
		StringBuilder errors = new StringBuilder();
		errors.append("it was not possible to perform the operation: ");
		try {
			dto = new Gson().fromJson(json, CryptoDTO.class);
			if (dto.getKeyA().isEmpty())
				throw new IllegalArgumentException();

			operation = dto.getOperation();

			switch (operation) {
			case 0:
				result = cryptoService.decrypt(dto.getText(), dto.getKeyA(), dto.getKeyB());
				break;
			case 1:
				result = cryptoService.encrypt(dto.getText(), dto.getKeyA(), dto.getKeyB());
				break;
			default:
				errors.append("invalid operation");
				throw new Exception();
			}

			return new ResponseEntity<String>(result, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(errors.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
