package com.aes256project.infra;

public class CryptoParameters {
	private String secretKeyA;
	private String secretKeyB;
	private byte[] byteArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	private String algorithm;
	private int PBEKeySpecArg1;
	private int PBEKeySpecArg2;
	private String SecretKeySpecAltorithm;
	private String cipherTransformation;
	private String encode;

	public CryptoParameters() {
		super();
		this.algorithm = "PBKDF2WithHmacSHA256";
		PBEKeySpecArg1 = 65536;
		PBEKeySpecArg2 = 256;
		SecretKeySpecAltorithm = "AES";
		this.cipherTransformation = "AES/CBC/PKCS5Padding";
		this.encode = "UTF-8";
	}

	public String getSecretKeyA() {
		return secretKeyA;
	}

	public void setSecretKeyA(String secretKeyA) {
		this.secretKeyA = secretKeyA;
	}

	public String getSecretKeyB() {
		return secretKeyB;
	}

	public void setSecretKeyB(String secretKeyB) {
		this.secretKeyB = secretKeyB;
	}

	public byte[] getByteArray() {
		return byteArray;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public int getPBEKeySpecArg1() {
		return PBEKeySpecArg1;
	}

	public int getPBEKeySpecArg2() {
		return PBEKeySpecArg2;
	}

	public String getSecretKeySpecAltorithm() {
		return SecretKeySpecAltorithm;
	}

	public String getCipherTransformation() {
		return cipherTransformation;
	}

	public String getEncode() {
		return encode;
	}

}
