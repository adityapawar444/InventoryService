package com.microservices.ims.inventoryservice.web;

import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class InventoryPagedList extends PageImpl<InventoryDto>{
	
	
	public InventoryPagedList(List<InventoryDto> content, Pageable pageable, long total) {
		super(content, pageable, total);
	}

	public InventoryPagedList(List<InventoryDto> content) {
		super(content);
	}

}
