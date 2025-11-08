package com.project.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.project.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	Optional <Order> findByReferenceId(String referenceId);

}
