package com.microservices.ims.inventoryservice.repositories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.microservices.ims.inventoryservice.entity.Inventory;

public interface InventoryRepository extends PagingAndSortingRepository<Inventory, UUID> {

}
