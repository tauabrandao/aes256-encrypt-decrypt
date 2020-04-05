package com.aes256project.dto;

import com.google.gson.Gson;

public class CryptoDTO {
	private String keyA;
	private String keyB;
	private String text;
	private Integer operation; // 0 - DECRYPT / 1 - ENCRYPT

	public String getKeyA() {
		return keyA;
	}

	public void setKeyA(String keyA) {
		this.keyA = keyA;
	}

	public String getKeyB() {
		return keyB;
	}

	public void setKeyB(String keyB) {
		this.keyB = keyB;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String toJson() {
		return new Gson().toJson(this);
	}

	public Integer getOperation() {
		return operation;
	}

	public void setOperation(Integer operation) {
		this.operation = operation;
	}

}
