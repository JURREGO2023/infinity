package com.infinity.user.ms_user.service;

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

    public ResponseEntity<UserEntity> create (UserEntity user){


        var newUser = this.repository.save(user);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newUser);
}
}