package com.aes256project.model;

public class Text {

	private String keyA;
	private String keyB;
	private String decriptedText;
	private String encryptedText;

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

	public String getDecriptedText() {
		return decriptedText;
	}

	public void setDecriptedText(String decriptedText) {
		this.decriptedText = decriptedText;
	}

	public String getEncryptedText() {
		return encryptedText;
	}

	public void setEncryptedText(String encryptedText) {
		this.encryptedText = encryptedText;
	}

	@Override
	public String toString() {
		return "Text [keyA=" + keyA + ", keyB=" + keyB + ", decriptedText=" + decriptedText + ", encryptedText="
				+ encryptedText + "]";
	}

}
