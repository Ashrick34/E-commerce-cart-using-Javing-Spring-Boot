package com.project.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.project.dto.CreateOrderRequest;
import com.project.project.dto.OrderCreated;
import com.project.project.entity.Order;
import com.project.project.service.OrderService;

@RestController
@RequestMapping("api/orders")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public ResponseEntity<?> createOrder(@RequestBody CreateOrderRequest orderRequest){
		
		 OrderCreated orderCreated = orderService.createOrder(orderRequest);
		 return ResponseEntity.ok().body(orderCreated);
	}
	
	@GetMapping("/{referenceId}")
	public ResponseEntity<?> getOrder(@PathVariable String referenceId){
		Order order = orderService.getOrder(referenceId);
		return ResponseEntity.ok().body(order);
	}
	
	
	
	
	
}
