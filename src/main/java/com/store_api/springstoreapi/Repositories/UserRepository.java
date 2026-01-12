package com.store_api.springstoreapi.Repositories;

import com.store_api.springstoreapi.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}