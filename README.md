# Mavenir-project-repo
This repository holds a toy inventory management project meant for Mavenir  interview test.



# Project Description

This is a SpringBoot + MongoDB Project , which is using 
  -Mongo Data JPA as orm tool
  -MongoDb as backend Database
  - SpringBoot 2.5.X version
  - Java 8 compiler and jdk version also 1.8


# End Points for ToyService:

1. localhost:8080/toys/addToy
{
	"id": 1234,
	"toyName": "BatMan",
	"model": "A",
	"brand": "LEGO",
	"price": 1500,
	"dateOfManufacture": "2018-12-10T13:49:51.141Z",
	"available" : true,

		"product": {
		"id": 555,
		"productType": "Action Figures",
		"manufacturerName": "GUANGDONG QUNXING TOYS JOINT-STOCK-2"
		}
	}


2. localhost:8080/toys/findAllToys
[
	{
	"id": 1234,
	"toyName": "BatMan",
	"model": "A",
	"brand": "LEGO",
	"price": 1500,
	"dateOfManufacture": "2018-12-10T13:49:51.141Z",
	"available" : true,

		"product": {
		"id": 555,
		"productType": "Action Figures",
		"manufacturerName": "GUANGDONG QUNXING TOYS JOINT-STOCK-2"
		}
	}

	{
	"id": 5678,
	"toyName": "Makup Set",
	"model": "B",
	"brand": "Barbie",
	"price": 1200,
	"dateOfManufacture": "2015-12-10T13:12:51.111Z",
	"available" : true,

		"product": {
		"id": 666,
		"productType": "kits",
		"manufacturerName": "HASBRO"
		}
	}

	{
	"id": 6789,
	"toyName": "Mercedes Benz",
	"model": "B",
	"brand": "LEGO",
	"price": 1200,
	"dateOfManufacture": "2010-09-10T13:12:51.111Z",
	"available" : true,

		"product": {
		"id": 777,
		"productType": "automobiles",
		"manufacturerName": "TOMY COMPANY"
		}
	}
]

# End Points for Product Service:-

1. localhost:8080/products/addProduct
{
        "id": 111,
        "productType": "Action Figures",
		"manufacturerName": "GUANGDONG QUNXING TOYS JOINT-STOCK"
        
    }


2. localhost:8080/products/findAllProducts
[
    {
        "id": 111,
        "productType": "Action Figures",
		"manufacturerName": "GUANGDONG QUNXING TOYS JOINT-STOCK"
        
    },
	
	{
        "id": 222,
        "productType": "Construction toys",
		"manufacturerName": "HASBRO"
        
    },
	
	{
        "id": 333,
        "productType": "Dolls",
		"manufacturerName": "TOMY COMPANY"
        
    },
	{
        "id": 444,
        "productType": "Electronic toys",
		"manufacturerName": "TOMY COMPANY"
        
    }
]

3. localhost:8080/products/findProduct/111
{
    "id": 111,
    "productType": "Action Figures",
    "manufacturerName": "GUANGDONG QUNXING TOYS JOINT-STOCK"
}

localhost:8080/products/deleteProduct/444
product deleted product having product id as: 444



