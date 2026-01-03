package com.proj.microservices.inventory.service;

public interface InventoryService {

	boolean isInStock(String skuCode, Long qunatity);

}
