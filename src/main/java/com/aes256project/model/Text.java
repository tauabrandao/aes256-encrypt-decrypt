package com.aes256project.model;

public class Text {

	private String keyA;
	private String keyB;
	private String decryptedText;
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

	public String getDecryptedText() {
		return decryptedText;
	}

	public void setDecryptedText(String decryptedText) {
		this.decryptedText = decryptedText;
	}

	public String getEncryptedText() {
		return encryptedText;
	}

	public void setEncryptedText(String encryptedText) {
		this.encryptedText = encryptedText;
	}

	@Override
	public String toString() {
		return "Text [keyA=" + keyA + ", keyB=" + keyB + ", decriptedText=" + decryptedText + ", encryptedText="
				+ encryptedText + "]";
	}

}
