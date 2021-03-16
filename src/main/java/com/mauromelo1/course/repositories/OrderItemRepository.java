package com.mauromelo1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauromelo1.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
