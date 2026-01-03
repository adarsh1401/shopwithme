package com.proj.microservices.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.microservices.order.dto.OrderRequest;
import com.proj.microservices.order.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping
	public String placeOrder(@RequestBody OrderRequest orderRequest) throws Exception {
		return orderService.placeOrder(orderRequest);
	}
}
