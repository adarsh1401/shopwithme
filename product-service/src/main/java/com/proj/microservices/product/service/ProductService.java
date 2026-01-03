package com.proj.microservices.product.service;


import java.util.List;


import com.proj.microservices.product.dto.ProductRequest;
import com.proj.microservices.product.dto.ProductResponse;

public interface ProductService {
	public ProductResponse createProduct(ProductRequest productRequest);
	
	public List<ProductResponse> getAllProducts();
}
