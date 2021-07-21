package com.org.mavenir.toyInventoryservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.org.mavenir.toyInventoryservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, Integer>	{

}
