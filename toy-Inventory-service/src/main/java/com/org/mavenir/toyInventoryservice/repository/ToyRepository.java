package com.org.mavenir.toyInventoryservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.org.mavenir.toyInventoryservice.model.Toy;

public interface ToyRepository extends MongoRepository<Toy, Integer>	{
	
	// List<Toy> findByBrand(String brand) ;


	 // Toy findToyByName(String toyName);
	

}
