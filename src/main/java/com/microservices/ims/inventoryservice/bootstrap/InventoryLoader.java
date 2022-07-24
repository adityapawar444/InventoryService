package com.microservices.ims.inventoryservice.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.microservices.ims.inventoryservice.entity.Inventory;
import com.microservices.ims.inventoryservice.repositories.InventoryRepository;
import com.microservices.ims.inventoryservice.web.constants.InventoryGroup;

@Component
public class InventoryLoader implements CommandLineRunner {

	private final InventoryRepository inventoryRepository;
	
	public InventoryLoader(InventoryRepository inventoryRepository) {
		this.inventoryRepository = inventoryRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		loadData();
	}

	private void loadData() {
		if (inventoryRepository.count() == 0) {
			
			inventoryRepository.save(Inventory.builder()
					.inventoryName("Wheat")
					.inventoryGroup(InventoryGroup.GRAINS)
					.quantity(1234.0)
					.perUnitPrice(new BigDecimal(1000.0)).build());
			
			inventoryRepository.save(Inventory.builder()
					.inventoryName("Rice")
					.inventoryGroup(InventoryGroup.GRAINS)
					.quantity(4321.0)
					.perUnitPrice(new BigDecimal(800.0)).build());
			
			System.out.println("Data Loaded - " + inventoryRepository.count());
		}
	}

}
