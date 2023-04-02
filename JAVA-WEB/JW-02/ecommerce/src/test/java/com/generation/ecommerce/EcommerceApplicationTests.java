package com.generation.ecommerce;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.generation.ecommerce.models.Producto;

@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests
{

	@Autowired
	private MockMvc mockMvc;

	@Test
	// @Disabled("Deshabilitado porque ya fue aprobado")
	public void pruebaGET() throws Exception
	{
		this.mockMvc.perform(get("/miOtzo/productos/1")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Bryan2.jpg")));
	} // pruebaGET

	@Test
	@Disabled("Deshabilitado porque ya fue aprobado")
	public void pruebaDELETE() throws Exception
	{
		this.mockMvc.perform(delete("/miOtzo/productos/7")).andDo(print()).andExpect(status().isOk());
	} // pruebaDELETE

	@Test
	@Disabled("Deshabilitado porque ya fue aprobado")
	public void pruebaPOST() throws Exception
	{
		Producto p = new Producto();
		p.setNombre("Cuadernos");
		p.setDescripcion("Cuaderno");
		p.setURL_Imagen("pizza.jpg");
		p.setPrecio(74.22);

		this.mockMvc
				.perform(post("/miOtzo/productos/").contentType(MediaType.APPLICATION_JSON).content(asJsonString(p)))
				.andDo(print()).andExpect(status().isOk());
	}// pruebaPOST

	@Test
	@Disabled("Deshabilitado porque ya fue aprobado")
	public void pruebaPUT() throws Exception
	{
		this.mockMvc.perform(put("/miOtzo/productos/6").queryParam("url_Imagen", "papasSabritas.jpg")).andDo(print())
				.andExpect(status().isOk());
	}// pruebaPUT

	private static String asJsonString(final Object obj)
	{
		try
		{
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		} // catch
	} // asJsonString
}