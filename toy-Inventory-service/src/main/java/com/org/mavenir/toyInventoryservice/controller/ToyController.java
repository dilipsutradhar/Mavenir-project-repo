package com.org.mavenir.toyInventoryservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.mavenir.toyInventoryservice.model.Toy;
import com.org.mavenir.toyInventoryservice.repository.ToyRepository;

@RestController
@RequestMapping("/toys")
public class ToyController {
	
	@Autowired
	private ToyRepository toyRepository;
	
	@PostMapping("/addToy")
	public String saveProduct(@RequestBody Toy toy) {
		toyRepository.save(toy);
		return "Added Toy to inventory with Toy ID:"+ toy.getId();
		
	}
	
	@GetMapping("/findAllToys")
	public List<Toy>getAllToy() {
		return toyRepository.findAll();
	}
	
	@GetMapping("/findToys/{id}")
	public Optional<Toy> getToy(@PathVariable int id){
		return toyRepository.findById(id);
	}
	
	/*
	@GetMapping("findToy/{toyName}")
    public Toy findToyByName(@PathVariable String toyName) {
        return toyRepository.findToyByName(toyName);
    }
	*/
	@DeleteMapping("/deleteToy/{id}")
	public String deleteToy(@PathVariable int id){
		toyRepository.deleteById(id);
		return "toy deleted from inventory:"+ id;
	}

}
