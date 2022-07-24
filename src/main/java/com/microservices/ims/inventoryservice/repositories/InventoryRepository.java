package com.microservices.ims.inventoryservice.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.ims.inventoryservice.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, UUID> {

}
