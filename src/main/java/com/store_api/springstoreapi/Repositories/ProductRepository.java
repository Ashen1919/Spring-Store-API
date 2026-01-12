package com.store_api.springstoreapi.Repositories;

import com.store_api.springstoreapi.Entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}