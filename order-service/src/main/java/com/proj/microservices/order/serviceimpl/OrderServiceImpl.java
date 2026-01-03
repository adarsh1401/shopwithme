package com.proj.microservices.order.serviceimpl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.microservices.order.client.InventoryClient;
import com.proj.microservices.order.dto.OrderRequest;
import com.proj.microservices.order.model.Order;
import com.proj.microservices.order.repository.OrderRepository;
import com.proj.microservices.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	InventoryClient inventoryClient;
	
	@Override
	public String placeOrder(OrderRequest orderRequest) throws Exception {
		
		boolean inStock = inventoryClient.isInStock(orderRequest.getSkuCode(), Long.valueOf(orderRequest.getQuantity()));
		
		if(inStock) {
			Order order = new Order();
			order.setOrderNumber(UUID.randomUUID().toString());
			order.setPrice(orderRequest.getPrice());
			order.setQuantity(orderRequest.getQuantity());
			order.setSkuCode(orderRequest.getSkuCode());
			orderRepository.save(order);
			return order.getOrderNumber();
		} else {
			throw new Exception("Product with skucode: "+orderRequest.getSkuCode() +" is not in stock");
		}
	}
}
