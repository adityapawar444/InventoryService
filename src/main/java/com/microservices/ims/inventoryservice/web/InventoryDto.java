package com.microservices.ims.inventoryservice.web;

import java.math.BigDecimal;
import java.util.UUID;

import com.microservices.ims.inventoryservice.web.constants.InventoryGroup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryDto {
	
	private UUID inventoryId;
	
	private InventoryGroup inventoryGroup;
	
	private String inventoryName;
	
	private Double quantity;
	
	private BigDecimal perUnitPrice;

}
