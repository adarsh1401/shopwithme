package com.proj.microservices.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.microservices.inventory.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
	
	@Autowired
	InventoryService insventoryService;
	
	@GetMapping
	public boolean isInStock(String skuCode,Long quantity) {
		return insventoryService.isInStock(skuCode, quantity);
	}
}
