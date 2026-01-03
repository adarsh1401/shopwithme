package com.proj.microservices.order.service;

import com.proj.microservices.order.dto.OrderRequest;

public interface OrderService {

	String placeOrder(OrderRequest orderRequest) throws Exception;

}
