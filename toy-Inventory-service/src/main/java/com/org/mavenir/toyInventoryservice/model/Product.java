package com.org.mavenir.toyInventoryservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

@Document(collection ="products")
public class Product {
	
	public Product(int id, String productType, String manufacturerName) {
		super();
		this.id = id;
		this.productType = productType;
		this.manufacturerName = manufacturerName;
	}
	@Id
	private int id;
	private String productType;
	private String manufacturerName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	
	
	
}
