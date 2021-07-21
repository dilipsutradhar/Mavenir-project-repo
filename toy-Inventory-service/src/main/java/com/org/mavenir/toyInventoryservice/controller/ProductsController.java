package com.org.mavenir.toyInventoryservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.mavenir.toyInventoryservice.model.Product;
import com.org.mavenir.toyInventoryservice.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	private ProductRepository repository;
	
	//@PostMapping("/addProduct")
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String saveProduct(@RequestBody Product product) {
		repository.save(product);
		return "Added product with product ID:"+ product.getId();
		
	}
	
	@GetMapping("/findAllProducts")
	public List<Product>getProducts() {
		return repository.findAll();
	}
	
	@GetMapping("/findProduct/{id}")
	public Optional<Product> getProduct(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id){
		repository.deleteById(id);
		return "product deleted product having product id as:"+ id;
	}

}
