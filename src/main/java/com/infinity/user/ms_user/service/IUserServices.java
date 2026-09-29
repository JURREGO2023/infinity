package com.infinity.user.ms_user.service;

import com.infinity.user.ms_user.model.UserEntity;
import org.springframework.http.ResponseEntity;

public interface IUserServices {

    ResponseEntity <UserEntity> create(UserEntity user);
}
