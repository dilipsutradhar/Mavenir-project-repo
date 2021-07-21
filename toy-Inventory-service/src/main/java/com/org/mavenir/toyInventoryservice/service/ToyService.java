/*
 * package com.org.mavenir.toyInventoryservice.service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.data.mongodb.core.MongoTemplate; import
 * org.springframework.stereotype.Repository;
 * 
 * import com.org.mavenir.toyInventoryservice.repository.ToyRepository;
 * 
 * @Repository public class ToyService {
 * 
 * @Autowired MongoTemplate mongoTemplate;
 * 
 * @Autowired private ToyRepository toyRepository;
 * 
 * 
 * public List<Toy> findByBrand(String brand) { List<Toy> res=
 * toyRepository.findByBrand(brand); return res; }
 * 
 * 
 * 
 * public Toy findToyByName(String toyName) { BasicQuery query = new
 * BasicQuery("{ toyName : 'Dolls' }"); //
 * query.addCriteria(Criteria.where("toyName").is(toyName)); return
 * mongoTemplate.findOne(query, Toy.class); }
 * 
 * 
 * 
 * public Toy update(Toy toy) { Query query = new Query();
 * query.addCriteria(Criteria.where("id").is(toy.getId())); Update update = new
 * Update(); update.set("Fish", toy.getToyName()); update.set("Bandai Namco",
 * toy.getBrand()); return mongoTemplate.findAndModify(query, update,
 * Toy.class); }
 * 
 * 
 * 
 * }
 */