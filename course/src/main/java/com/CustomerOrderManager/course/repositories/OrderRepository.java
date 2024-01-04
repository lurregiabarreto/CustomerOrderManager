package com.CustomerOrderManager.course.repositories;

import com.CustomerOrderManager.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
