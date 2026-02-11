package com.hirushan.microservices.product.repository;
import com.hirushan.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ProductRepository extends MongoRepository<Product, String> {
}
