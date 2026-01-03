package com.proj.microservices.product.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.microservices.product.dto.ProductRequest;
import com.proj.microservices.product.dto.ProductResponse;
import com.proj.microservices.product.service.ProductService;

@RequestMapping("/api/product")
@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping
	public ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
		return productService.createProduct(productRequest);
	}
	
	@GetMapping
	public List<ProductResponse> getAllProducts(){
		return productService.getAllProducts();
	}

}
