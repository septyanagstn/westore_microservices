package com.westore.microservices.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.westore.microservices.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
