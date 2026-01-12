package com.store_api.springstoreapi.Repositories;

import com.store_api.springstoreapi.Entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}