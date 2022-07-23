package com.microservices.ims.inventoryservice.web.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.ims.inventoryservice.web.InventoryDto;

@RequestMapping("/api/v1/inventory")
@RestController
public class InventoryController {
	
	@GetMapping("/{inventoryId}")
	public ResponseEntity<InventoryDto> getInventorybyId(@PathVariable("inventoryId") UUID inventoryId){
		//TODO: impl
		return new ResponseEntity<InventoryDto>(InventoryDto.builder().build(),HttpStatus.OK); 
	}
	
	@PostMapping
	public ResponseEntity createNewInventory(@RequestBody InventoryDto newInventory){
		//TODO: impl
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@PostMapping("/{inventoryId}")
	public ResponseEntity updateInventory(@PathVariable("inventoryId") UUID inventoryId, @RequestBody InventoryDto updatedInventory) {
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

}
