package com.aes256project.service;

import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Component;

import com.aes256project.infra.CryptoParameters;


@Component
public class CryptoService {
	
	
	private static CryptoParameters parameters = new CryptoParameters();

	public String encrypt(String strToEncrypt, String keyA, String keyB) {
		try {
			byte[] iv = parameters.getByteArray();
			IvParameterSpec ivspec = new IvParameterSpec(iv);

			SecretKeyFactory factory = SecretKeyFactory.getInstance(parameters.getAlgorithm());
			KeySpec spec = new PBEKeySpec(keyA.toCharArray(), keyB.getBytes(), parameters.getPBEKeySpecArg1(),
					parameters.getPBEKeySpecArg2());
			SecretKey tmp = factory.generateSecret(spec);
			SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), parameters.getSecretKeySpecAltorithm());

			Cipher cipher = Cipher.getInstance(parameters.getCipherTransformation());
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivspec);
			return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes(parameters.getEncode())));
		} catch (Exception e) {
			System.out.println("Houve um erro ao encriptar: " + e.toString());
		}
		return null;
	}

	public String decrypt(String strToDecrypt, String keyA, String keyB) {
		try {
			byte[] iv = parameters.getByteArray();
			IvParameterSpec ivspec = new IvParameterSpec(iv);

			SecretKeyFactory factory = SecretKeyFactory.getInstance(parameters.getAlgorithm());
			KeySpec spec = new PBEKeySpec(keyA.toCharArray(), keyB.getBytes(), parameters.getPBEKeySpecArg1(),
					parameters.getPBEKeySpecArg2());
			SecretKey tmp = factory.generateSecret(spec);
			SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), parameters.getSecretKeySpecAltorithm());

			Cipher cipher = Cipher.getInstance(parameters.getCipherTransformation());
			cipher.init(Cipher.DECRYPT_MODE, secretKey, ivspec);
			return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
		} catch (Exception e) {
			System.out.println("Houve um erro ao decriptar: " + e.toString());
		}
		return null;
	}


}
