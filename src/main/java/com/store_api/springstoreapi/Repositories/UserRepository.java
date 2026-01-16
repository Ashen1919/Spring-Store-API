package com.store_api.springstoreapi.Repositories;

import com.store_api.springstoreapi.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}