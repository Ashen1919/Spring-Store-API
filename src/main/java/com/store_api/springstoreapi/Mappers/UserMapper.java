package com.store_api.springstoreapi.Mappers;

import com.store_api.springstoreapi.Entities.User;
import com.store_api.springstoreapi.dtos.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto (User user);
}
