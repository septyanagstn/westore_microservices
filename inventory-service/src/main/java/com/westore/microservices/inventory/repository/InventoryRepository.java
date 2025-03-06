package com.westore.microservices.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.westore.microservices.inventory.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity);
}

