package com.infinity.user.ms_user.mapper;

import com.infinity.user.ms_user.dto.UserDTO;
import com.infinity.user.ms_user.model.UserEntity;

public class UserMapper {

    public static UserEntity dtoToEntity(UserDTO userDTO){
     return UserEntity.builder()
             .phone(userDTO.getPhone())
             .document(userDTO.getDocument())
             .email(userDTO.getEmail())
             .lastname(userDTO.getLastname())
             .name(userDTO.getName())
             .build();
    }
}
