package com.store_api.springstoreapi.Repositories;

import com.store_api.springstoreapi.Entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}