package aes256project;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.junit.Before;
import org.junit.Test;

import com.aes256project.dto.CryptoDTO;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CryptoTest {

	private Client client;
	private WebTarget target;

	@Before
	public void configura() {
		ClientConfig config = new ClientConfig();
		this.client = ClientBuilder.newClient(config);
		this.target = client.target("http://localhost:8080/aes256project");
	}

	@Test
	public void testaQueCriptografaUmaString() {
		CryptoDTO dto = new CryptoDTO();
		dto.setKeyA("e3ede");
		dto.setKeyB("99iKkijKi");
		dto.setText("Hello World");
		dto.setOperation(1);

		Entity<CryptoDTO> entity = Entity.entity(dto, MediaType.APPLICATION_JSON);
		Response response = target.path("/api/crypto").request().post(entity);
		Assert.assertEquals(200, response.getStatus());
		Assert.assertEquals("BF3g1PZ36HYXroi+GvsJ7A==", response.readEntity(String.class));

	}

	@Test
	public void testaQueDescriptografaUmaString() {
		CryptoDTO dto = new CryptoDTO();
		dto.setKeyA("e3ede");
		dto.setKeyB("99iKkijKi");
		dto.setText("BF3g1PZ36HYXroi+GvsJ7A==");
		dto.setOperation(0);

		Entity<CryptoDTO> entity = Entity.entity(dto, MediaType.APPLICATION_JSON);
		Response response = target.path("/api/crypto").request().post(entity);
		Assert.assertEquals(200, response.getStatus());
		Assert.assertEquals("Hello World", response.readEntity(String.class));

	}

}
