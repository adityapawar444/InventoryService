package com.microservices.ims.inventoryservice.web;

import java.math.BigDecimal;
import java.util.UUID;

import com.microservices.ims.inventoryservice.web.constants.InventoryGroup;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryDto {
	
	@Null
	private UUID inventoryId;
	
	@NotBlank
	private InventoryGroup inventoryGroup;
	
	@NotBlank
	private String inventoryName;
	
	@Positive
	private Double quantity;
	
	@Positive
	private BigDecimal perUnitPrice;

}
