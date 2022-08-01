package com.microservices.ims.inventoryservice.service.mappers;

import org.mapstruct.Mapper;

import com.microservices.ims.inventoryservice.entity.Inventory;
import com.microservices.ims.inventoryservice.web.InventoryDto;

@Mapper
public interface EntityToDtoMapper {

	InventoryDto inventoryToInventoryDto(Inventory inventory);
}
