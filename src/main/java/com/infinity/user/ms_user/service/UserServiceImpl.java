package com.infinity.user.ms_user.service;

import com.infinity.user.ms_user.dto.UserDTO;
import com.infinity.user.ms_user.mapper.UserMapper;
import com.infinity.user.ms_user.model.UserEntity;
import com.infinity.user.ms_user.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.IllformedLocaleException;


@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserServices{

    private final IUserRepository repository;


    @Override

    public ResponseEntity<UserEntity> create (UserDTO user){

        /*UserEntity userDb = new UserEntity();
        userDb.setPhone(user.getPhone());
        userDb.setDocument(user.getDocument());
        userDb.setEmail(user.getEmail());
        userDb.setLastname(user.getLastname());
        userDb.setName(user.getName());*/


UserEntity userDb = UserMapper.dtoToEntity(user);

        var newUser = this.repository.save(userDb);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newUser);
}
}