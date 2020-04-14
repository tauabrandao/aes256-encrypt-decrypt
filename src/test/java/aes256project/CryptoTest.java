package aes256project;

import org.junit.Test;

import com.aes256project.service.CryptoService;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CryptoTest {

	CryptoService cryptoService = new CryptoService();

	@Test
	public void testaQueCriptografaUmaString() throws Exception {
		String texto = "Hello World";
		String resultado = cryptoService.encrypt(texto, "e3ede", "99iKkijKi");
		Assert.assertEquals("BF3g1PZ36HYXroi+GvsJ7A==", resultado);

	}

	@Test
	public void testaQueDescriptografaUmaString() throws Exception {
		String texto = "BF3g1PZ36HYXroi+GvsJ7A==";
		String resultado = cryptoService.decrypt(texto, "e3ede", "99iKkijKi");
		Assert.assertEquals("Hello World", resultado);
	}

}
