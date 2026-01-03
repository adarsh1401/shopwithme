package com.proj.microservices.product.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.microservices.product.dto.ProductRequest;
import com.proj.microservices.product.dto.ProductResponse;
import com.proj.microservices.product.model.Product;
import com.proj.microservices.product.repository.ProductRepository;
import com.proj.microservices.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public ProductResponse createProduct(ProductRequest productRequest) {
		Product product = new Product();
		product.setId(productRequest.getId());
		product.setName(productRequest.getName());
		product.setDescription(productRequest.getDescription());
		product.setPrice(productRequest.getPrice());
		productRepository.save(product);
		return new ProductResponse(product.getId(), product.getName(), product.getDescription(), product.getPrice());
	}

	@Override
	public List<ProductResponse> getAllProducts() {
		List<Product> products = productRepository.findAll();
		if(products != null) {
			return products.stream().map(product->new ProductResponse(product.getId(), product.getName(),
					product.getDescription(), product.getPrice())).toList();
		}
		return null;
	}

}
