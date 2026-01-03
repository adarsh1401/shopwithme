package com.proj.microservices.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.proj.microservices.product.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
