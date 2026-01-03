package com.proj.microservices.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.microservices.inventory.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{
	
	boolean existsBySkuCodeAndQuantityGreaterThanEqual(String skuCode,Long quantity);
}
