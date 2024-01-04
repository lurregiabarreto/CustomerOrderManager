package com.CustomerOrderManager.course.repositories;

import com.CustomerOrderManager.course.entities.OrderItem;
import com.CustomerOrderManager.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
