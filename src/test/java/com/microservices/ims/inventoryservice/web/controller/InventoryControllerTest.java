package com.microservices.ims.inventoryservice.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservices.ims.inventoryservice.web.InventoryDto;
import com.microservices.ims.inventoryservice.web.controllers.InventoryController;

@WebMvcTest(InventoryController.class) // enables config relevant only for MVC tests
public class InventoryControllerTest {

	@Autowired
	MockMvc mockMvc; //helps to test controllers by starting a servlet container
	
	@Autowired
	ObjectMapper objectMapper; //converts POJO to json obj
	
	@Test
	void getInventoryById() throws Exception{
		
		mockMvc.perform(get("/api/v1/inventory/" + UUID.randomUUID().toString())
						.accept(MediaType.APPLICATION_JSON))
						.andExpect(status().isOk());
	}
	
	@Test
	void createNewInventory() throws Exception {
		
		InventoryDto newInventory = InventoryDto.builder().build();
		String newInventoryJSON = objectMapper.writeValueAsString(newInventory);
		
		mockMvc.perform(post("/api/v1/inventory")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newInventoryJSON))
				.andExpect(status().isCreated());
	}
	
	@Test
	void updateInventorybyId() throws Exception {
		
		InventoryDto updatedInventory = InventoryDto.builder().build();
		String updatedInventoryJSON = objectMapper.writeValueAsString(updatedInventory);
		
		mockMvc.perform(post("/api/v1/inventory/" + UUID.randomUUID().toString())
				.contentType(MediaType.APPLICATION_JSON)
				.content(updatedInventoryJSON))
				.andExpect(status().isNoContent());
	}
	
}
