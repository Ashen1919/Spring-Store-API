package com.store_api.springstoreapi.Repositories;

import com.store_api.springstoreapi.Entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}