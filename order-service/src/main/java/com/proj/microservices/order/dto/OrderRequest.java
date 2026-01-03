package com.proj.microservices.order.dto;

public class OrderRequest {
	
	private Long id;

	private String orderNumber;
	
	private String skuCode;
	
	private double price;
	
	private Integer quantity;
	
	public OrderRequest(Long id, String orderNumber, String skuCode, double price, Integer quantity) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.skuCode = skuCode;
		this.price = price;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
