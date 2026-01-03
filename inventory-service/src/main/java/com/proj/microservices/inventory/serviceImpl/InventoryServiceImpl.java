package com.proj.microservices.inventory.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.microservices.inventory.repository.InventoryRepository;
import com.proj.microservices.inventory.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService{
	
	@Autowired
	InventoryRepository inventoryRepository;
	
	@Override
	public boolean isInStock(String skuCode,Long qunatity) {
		return inventoryRepository.existsBySkuCodeAndQuantityGreaterThanEqual(skuCode, qunatity);
	}
}
